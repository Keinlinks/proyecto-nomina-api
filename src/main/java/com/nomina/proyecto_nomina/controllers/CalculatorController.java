package com.nomina.proyecto_nomina.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.nomina.proyecto_nomina.Afp_classes.*;
import com.nomina.proyecto_nomina.classes_pojo.NominalSalary;
import com.nomina.proyecto_nomina.classes_pojo.Nominal_response;
import com.nomina.proyecto_nomina.health_system.Fonasa;
import com.nomina.proyecto_nomina.health_system.Isapre;
import com.nomina.proyecto_nomina.services.Afp_fabric;
import com.nomina.proyecto_nomina.services.Unique_rent;
import com.nomina.proyecto_nomina.interfaces.HealthSystemStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/calculator")
@CrossOrigin(origins = "http://localhost:4200")
public class CalculatorController {
    @Autowired
    private Afp_fabric afp_fabric;

    @Autowired
    private Unique_rent unique_rent;

    @PostMapping("nominaSalary")
    public Nominal_response nomina(@RequestBody NominalSalary entity) {
        //se inicia el objeto de la clase nominal_response
        Nominal_response nominal_response = new Nominal_response(entity.salary_per_day, entity.day_worked, entity.bonus, entity.extra_hours, entity.extra_price_per_hour, entity.afp, entity.health_system);

        //se calcula el salario imponible el cual se sometera a los descuentos
        nominal_response.setImponible_salary((nominal_response.salary_per_day * nominal_response.day_worked) + nominal_response.bonus + nominal_response.extra_hours * nominal_response.extra_price_per_hour);

        //se calcula el tax de afp

        Afp afp;
        afp = afp_fabric.getAfp(entity.afp);
        int tax_afp = (int) Math.ceil(afp.calculateAfp(nominal_response.getImponible_salary()));
        nominal_response.setAfp_tax(tax_afp);
        
        //se calcula el tax de health system
        switch (entity.health_system) {
            case "FONASA":
                HealthSystemStrategy healthSystemStrategy = new Fonasa();
                int tax_healthSystem = healthSystemStrategy.calculateHealthSystem(nominal_response.getImponible_salary());
                nominal_response.setHealth_system_tax(tax_healthSystem);
                break;
            case "ISAPRE":
                HealthSystemStrategy healthSystemStrategy1 = new Isapre();
                int tax_healthSystem1 = healthSystemStrategy1.calculateHealthSystem(nominal_response.getImponible_salary());
                nominal_response.setHealth_system_tax(tax_healthSystem1);
                break;
            default:
                break;
        }
        nominal_response.calculateImponibleRent();

        //se calcula el tax de rent
        int tax_rent = unique_rent.get_rent_tax(nominal_response.getImponible_rent());
        nominal_response.setRent_tax(tax_rent);
        //
        nominal_response.calculateLiquidSalary();
        return nominal_response;
    }
}

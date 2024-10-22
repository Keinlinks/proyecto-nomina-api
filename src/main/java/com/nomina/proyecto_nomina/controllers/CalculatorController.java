package com.nomina.proyecto_nomina.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.nomina.proyecto_nomina.classes.Afp;
import com.nomina.proyecto_nomina.classes.CapitalAfp;
import com.nomina.proyecto_nomina.classes.CuprumAfp;
import com.nomina.proyecto_nomina.classes.HabitatAfp;
import com.nomina.proyecto_nomina.classes.NominalSalary;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/calculator")
@CrossOrigin(origins = "http://localhost:4200")
public class CalculatorController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "hola";
    }

    @PostMapping("nominaSalary")
    public String nomina(@RequestBody NominalSalary entity) {
        int salary_hours = entity.salary * entity.hours;
        int salary_hours_bonus = salary_hours + entity.bonus;
        double deducction= 0;

        Afp afp;
        switch(entity.afp){
            case "Capital":
                CapitalAfp capitalAfp = new CapitalAfp();
                afp = new Afp(capitalAfp);
                deducction = afp.calculateAfp(salary_hours_bonus);
                break;
            case "Cuprum":
                CuprumAfp cuprumAfp = new CuprumAfp();
                afp = new Afp(cuprumAfp);
                deducction = afp.calculateAfp(salary_hours_bonus);
                break;
            case "Habitat":
                HabitatAfp habitatAfp = new HabitatAfp();
                afp = new Afp(habitatAfp);
                deducction = afp.calculateAfp(salary_hours_bonus);
                break;
            default:
                break;
        }
        int deducction_int = (int) Math.ceil(deducction);
        return String.valueOf(deducction_int);
    }
}

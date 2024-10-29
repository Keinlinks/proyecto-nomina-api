package com.nomina.proyecto_nomina.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.nomina.proyecto_nomina.classes.*;

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
            case "Modelo":
                ModeloAfp modeloAfp = new ModeloAfp();
                afp = new Afp(modeloAfp);
                deducction = afp.calculateAfp(salary_hours_bonus);
                break;
            case "PlanVital":
                PlanVitalAfp planVitalAfp = new PlanVitalAfp();
                afp = new Afp(planVitalAfp);
                deducction = afp.calculateAfp(salary_hours_bonus);
                break;
            case "Provida":
                ProvidaAfp providaAfp = new ProvidaAfp();
                afp = new Afp(providaAfp);
                deducction = afp.calculateAfp(salary_hours_bonus);
                break;
            case "Uno":
                UnoAfp unoAfp = new UnoAfp();
                afp = new Afp(unoAfp);
                deducction = afp.calculateAfp(salary_hours_bonus);
                break;
            default:
                break;
        }
        int deducction_int = (int) Math.ceil(deducction);
        return String.valueOf(deducction_int);
    }
}

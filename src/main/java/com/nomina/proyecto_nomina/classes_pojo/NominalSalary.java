package com.nomina.proyecto_nomina.classes_pojo;

import org.springframework.stereotype.Component;

@Component
public class NominalSalary {
    public int salary_per_day = 0;
    public int day_worked = 0;
    public int bonus = 0;
    public int extra_hours = 0;
    public int extra_price_per_hour = 0;
    public String afp = "";
    public String health_system = "";

    public NominalSalary(int salary_per_day, int day_worked, int bonus, int extra_hours, int extra_price_per_hour, String afp,
            String health_system) {
        this.salary_per_day = salary_per_day;
        this.day_worked = day_worked;
        this.bonus = bonus;
        this.extra_hours = extra_hours;
        this.extra_price_per_hour = extra_price_per_hour;
        this.afp = afp;
        this.health_system = health_system;
    }
    public NominalSalary() {

    }
    

}


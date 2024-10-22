package com.nomina.proyecto_nomina.classes;

public class NominalSalary {
    public int salary = 0;
    public int hours = 0;
    public int bonus = 0;
    public String afp = "";
    public String healthSystem = "";

    NominalSalary(int salary, int hours, int bonus, String afp, String healthSystem) {
        this.salary = salary;
        this.hours = hours;
        this.bonus = bonus;
        this.afp = afp;
        this.healthSystem = healthSystem;
    }
}


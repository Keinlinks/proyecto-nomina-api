package com.nomina.proyecto_nomina.classes;

public class NominalSalary {
    public int salary = 0;
    public int hours = 0;
    public int bonus = 0;
    public String afp = "";
    public String health_system = "";

    NominalSalary(int salary, int hours, int bonus, String afp, String health_system) {
        this.salary = salary;
        this.hours = hours;
        this.bonus = bonus;
        this.afp = afp;
        this.health_system = health_system;
    }
}


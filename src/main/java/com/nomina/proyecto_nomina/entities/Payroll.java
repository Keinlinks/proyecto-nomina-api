package com.nomina.proyecto_nomina.entities;

import org.springframework.data.annotation.Id;

public class Payroll {
    @Id
    private String id;
    private String rut;
    private double salary_per_day;
    private int day_worked;
    private int extra_hours;
    private double extra_price_per_hour;
    private double bonus;
    private String afp;
    private String health_system;
    private double afp_tax;
    private double health_system_tax;
    private double rent_tax;
    private double imponible_salary;
    private double imponible_rent;
    private double liquid_salary;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public double getSalary_per_day() {
        return salary_per_day;
    }
    public void setSalary_per_day(double salary_per_day) {
        this.salary_per_day = salary_per_day;
    }
    public int getDay_worked() {
        return day_worked;
    }
    public void setDay_worked(int day_worked) {
        this.day_worked = day_worked;
    }
    public int getExtra_hours() {
        return extra_hours;
    }
    public void setExtra_hours(int extra_hours) {
        this.extra_hours = extra_hours;
    }
    public double getExtra_price_per_hour() {
        return extra_price_per_hour;
    }
    public void setExtra_price_per_hour(double extra_price_per_hour) {
        this.extra_price_per_hour = extra_price_per_hour;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public String getAfp() {
        return afp;
    }
    public void setAfp(String afp) {
        this.afp = afp;
    }
    public String getHealth_system() {
        return health_system;
    }
    public void setHealth_system(String health_system) {
        this.health_system = health_system;
    }
    public double getAfp_tax() {
        return afp_tax;
    }
    public void setAfp_tax(double afp_tax) {
        this.afp_tax = afp_tax;
    }
    public double getHealth_system_tax() {
        return health_system_tax;
    }
    public void setHealth_system_tax(double health_system_tax) {
        this.health_system_tax = health_system_tax;
    }
    public double getRent_tax() {
        return rent_tax;
    }
    public void setRent_tax(double rent_tax) {
        this.rent_tax = rent_tax;
    }
    public double getImponible_salary() {
        return imponible_salary;
    }
    public void setImponible_salary(double imponible_salary) {
        this.imponible_salary = imponible_salary;
    }
    public double getImponible_rent() {
        return imponible_rent;
    }
    public void setImponible_rent(double imponible_rent) {
        this.imponible_rent = imponible_rent;
    }
    public double getLiquid_salary() {
        return liquid_salary;
    }
    public void setLiquid_salary(double liquid_salary) {
        this.liquid_salary = liquid_salary;
    }
}

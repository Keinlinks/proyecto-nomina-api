package com.nomina.proyecto_nomina.classes_pojo;

public class Nominal_response extends NominalSalary {
    int afp_tax = 0;
    int health_system_tax = 0;
    int rent_tax = 0;
    int imponible_salary = 0;
    int imponible_rent = 0;
    int liquid_salary = 0;
    public int getImponible_rent() {
        return imponible_rent;
    }

    public void setImponible_rent(int imponible_rent) {
        this.imponible_rent = imponible_rent;
    }


    public int getImponible_salary() {
        return imponible_salary;
    }

    public void setImponible_salary(int imponible_salary) {
        this.imponible_salary = imponible_salary;
    }

    public Nominal_response(int salary_per_day, int day_worked, int bonus, int extra_hours, int price_per_hour, String afp,String healthSystem) {
        super(salary_per_day, day_worked, bonus, extra_hours, price_per_hour, afp, healthSystem);
    }

    public int getAfp_tax() {
        return afp_tax;
    }


    public void setAfp_tax(int afp_tax) {
        this.afp_tax = afp_tax;
    }


    public int getHealth_system_tax() {
        return health_system_tax;
    }


    public void setHealth_system_tax(int health_system_tax) {
        this.health_system_tax = health_system_tax;
    }


    public int getRent_tax() {
        return rent_tax;
    }


    public void setRent_tax(int rent_tax) {
        this.rent_tax = rent_tax;
    }


    public int getLiquid_salary() {
        return liquid_salary;
    }


    public void setLiquid_salary(int liquid_salary) {
        this.liquid_salary = liquid_salary;
    }

    public void calculateLiquidSalary() {
        liquid_salary = imponible_salary - afp_tax - health_system_tax - rent_tax;
    }

    public void calculateImponibleRent() {
        imponible_rent = imponible_salary - afp_tax - health_system_tax;
    }
    
    
}

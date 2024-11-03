package com.nomina.proyecto_nomina.services;

import org.springframework.stereotype.Service;

@Service
public class Unique_rent {

    public int get_rent_tax(int salary){
        int tax;
        if (salary < 803762) return 0;
        else if (salary < 1787898) tax = calcualte_tax(salary, 0.04);
        else if (salary < 2976497) tax = calcualte_tax(salary, 0.08);
        else if (salary < 4165096) tax = calcualte_tax(salary, 0.135);
        else if (salary < 5354605) tax = calcualte_tax(salary, 0.23);
        else if (salary < 7142934) tax = calcualte_tax(salary, 0.304);
        else if (salary < 14285868) tax = calcualte_tax(salary, 0.355);
        else tax = calcualte_tax(salary, 0.40);
        return tax;
    }

    int calcualte_tax(int salary, double discount){
        return (int) Math.ceil(salary * discount);
    }
}

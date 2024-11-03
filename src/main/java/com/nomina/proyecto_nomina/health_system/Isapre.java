package com.nomina.proyecto_nomina.health_system;

import com.nomina.proyecto_nomina.interfaces.HealthSystemStrategy;

public class Isapre implements HealthSystemStrategy {
    private double discount = 0.07;
    public int calculateHealthSystem(int salary) {
        return (int) Math.ceil(salary * discount);
    }
}

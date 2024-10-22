package com.nomina.proyecto_nomina.classes;

import com.nomina.proyecto_nomina.interfaces.AfpStrategy;

public class CapitalAfp implements AfpStrategy {
    private static final double PERCENTAGE_AFP = 0.1338;
    @Override
    public double calculateAfp(double salario) {
        return salario * PERCENTAGE_AFP;
    }
    
}
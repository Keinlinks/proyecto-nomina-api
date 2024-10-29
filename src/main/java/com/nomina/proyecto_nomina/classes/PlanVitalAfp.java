package com.nomina.proyecto_nomina.classes;

import com.nomina.proyecto_nomina.interfaces.AfpStrategy;

public class PlanVitalAfp implements AfpStrategy {
    private static double PERCENTAGE_AFP;
    @Override
    public double calculateAfp(double salario) {
        Constants constants = new Constants();
        PERCENTAGE_AFP = constants.getPlanVitalConstant();

        return salario * PERCENTAGE_AFP;
    }
}
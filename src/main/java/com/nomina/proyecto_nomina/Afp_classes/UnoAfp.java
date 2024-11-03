package com.nomina.proyecto_nomina.Afp_classes;

import com.nomina.proyecto_nomina.interfaces.AfpStrategy;

public class UnoAfp implements AfpStrategy {
    private static double PERCENTAGE_AFP;
    @Override
    public double calculateAfp(double salario) {
        Constants constants = new Constants();
        PERCENTAGE_AFP = constants.getUnoConstant();

        return salario * PERCENTAGE_AFP;
    }
}

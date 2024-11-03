package com.nomina.proyecto_nomina.Afp_classes;

import com.nomina.proyecto_nomina.interfaces.AfpStrategy;

public class CuprumAfp implements AfpStrategy {
    private static double PERCENTAGE_AFP;
    @Override
    public double calculateAfp(double salario) {
        Constants constants = new Constants();
        PERCENTAGE_AFP = constants.getCuprumConstant();
        return salario * PERCENTAGE_AFP;
    }
    
}
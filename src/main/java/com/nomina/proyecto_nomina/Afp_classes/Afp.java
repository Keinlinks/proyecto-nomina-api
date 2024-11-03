package com.nomina.proyecto_nomina.Afp_classes;

import com.nomina.proyecto_nomina.interfaces.AfpStrategy;

public class Afp {

    private AfpStrategy afpStrategy;

    // Se inyecta la estrategia en el constructor o mediante un setter
    public Afp(AfpStrategy afpStrategy) {
        this.afpStrategy = afpStrategy;
    }

    public double calculateAfp(double salary) {
        double deduccionAfp = afpStrategy.calculateAfp(salary);

        return deduccionAfp;
    }
}
package com.nomina.proyecto_nomina.Afp_classes;

public class Constants {
    public static final double RENTA_IMPONIBLE = 0.10;
    public static final double CAPITAL_AFP = 0.0144;
    public static final double CUPRUM_AFP = 0.0144;
    public static final double HABITAT_AFP = 0.027;
    public static final double MODELO_AFP = 0.0058;
    public static final double PLANVITAL_AFP = 0.0116;
    public static final double PROVIDA_AFP = 0.0145;
    public static final double UNO_AFP = 0.0049;

    double getCapitalConstant() {	
        return CAPITAL_AFP + RENTA_IMPONIBLE;
    }

    double getCuprumConstant() {	
        return CUPRUM_AFP + RENTA_IMPONIBLE;
    }

    double getHabitatConstant() {	
        return HABITAT_AFP + RENTA_IMPONIBLE;
    }

    double getModeloConstant() {	
        return MODELO_AFP + RENTA_IMPONIBLE;
    }

    double getPlanVitalConstant() {	
        return PLANVITAL_AFP + RENTA_IMPONIBLE;
    }

    double getProvidaConstant() {	
        return PROVIDA_AFP + RENTA_IMPONIBLE;
    }

    double getUnoConstant() {	
        return UNO_AFP + RENTA_IMPONIBLE;
    }
    
}

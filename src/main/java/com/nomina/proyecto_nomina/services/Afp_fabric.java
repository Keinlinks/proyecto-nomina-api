package com.nomina.proyecto_nomina.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.nomina.proyecto_nomina.Afp_classes.Afp;
import com.nomina.proyecto_nomina.Afp_classes.CapitalAfp;
import com.nomina.proyecto_nomina.Afp_classes.CuprumAfp;
import com.nomina.proyecto_nomina.Afp_classes.HabitatAfp;
import com.nomina.proyecto_nomina.Afp_classes.ModeloAfp;
import com.nomina.proyecto_nomina.Afp_classes.PlanVitalAfp;
import com.nomina.proyecto_nomina.Afp_classes.ProvidaAfp;
import com.nomina.proyecto_nomina.Afp_classes.UnoAfp;

@Primary
@Service
public class Afp_fabric {
    
    public Afp getAfp(String afpString){
        Afp afp;
        switch(afpString){
            case "Capital":
                CapitalAfp capitalAfp = new CapitalAfp();
                afp = new Afp(capitalAfp);
                break;
            case "Cuprum":
                CuprumAfp cuprumAfp = new CuprumAfp();
                afp = new Afp(cuprumAfp);
                break;
            case "Habitat":
                HabitatAfp habitatAfp = new HabitatAfp();
                afp = new Afp(habitatAfp);
                break;
            case "Modelo":
                ModeloAfp modeloAfp = new ModeloAfp();
                afp = new Afp(modeloAfp);
                break;
            case "PlanVital":
                PlanVitalAfp planVitalAfp = new PlanVitalAfp();
                afp = new Afp(planVitalAfp);
                break;
            case "Provida":
                ProvidaAfp providaAfp = new ProvidaAfp();
                afp = new Afp(providaAfp);
                break;
            case "Uno":
                UnoAfp unoAfp = new UnoAfp();
                afp = new Afp(unoAfp);
                break;
            default:
                CapitalAfp capitalAfp2 = new CapitalAfp();
                afp = new Afp(capitalAfp2);
                break;
        }

        return afp;
    }
}

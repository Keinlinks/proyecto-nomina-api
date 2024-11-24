package com.nomina.proyecto_nomina.interfaces;
import com.nomina.proyecto_nomina.entities.Payroll;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PayrollRepository extends MongoRepository<Payroll, String> {
    Optional<Payroll> findByRut(String rut);

    Payroll insert(Payroll payroll);

    Payroll save(Payroll payroll);
}

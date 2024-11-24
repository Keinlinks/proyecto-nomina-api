package com.nomina.proyecto_nomina.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nomina.proyecto_nomina.entities.Payroll;
import com.nomina.proyecto_nomina.services.DbService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/payroll")
@CrossOrigin(origins = "http://localhost:4200")
public class PayrollController {
    @Autowired
    private DbService dbService;

    @PostMapping()
    public Payroll insert(@RequestBody Payroll entity){
        return dbService.savePayroll(entity);
    }


    @GetMapping()
    public Payroll getPayrollByRut(@RequestParam String rut) {
        return dbService.findPayrollByRut(rut);
    }

    @PutMapping()
    public Payroll putMethodName(@RequestBody Payroll entity) {
        //TODO: process PUT request
        
        return dbService.updatePayroll(entity);
    }


}

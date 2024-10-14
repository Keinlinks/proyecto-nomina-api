package com.nomina.proyecto_nomina.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "hola";
    }

    @PostMapping("/nomina")
    public String nominaString(@RequestBody String entity) {
        return entity;
    }
    
    
}

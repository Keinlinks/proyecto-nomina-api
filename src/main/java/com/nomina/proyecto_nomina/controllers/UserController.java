package com.nomina.proyecto_nomina.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nomina.proyecto_nomina.entities.User;
import com.nomina.proyecto_nomina.services.DbService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    private DbService dbService;

    @GetMapping()
    public List<User> findAll(@RequestParam(value = "page", defaultValue = "0") int page){
        return dbService.findAllUsers(page, 10);
    }

    @PutMapping()
    public User update(@RequestBody User entity) {
        //TODO: process PUT request
        
        return dbService.updateUser(entity);
    }

    @PostMapping()
    public User insert(@RequestBody User entity){
        return dbService.saveUser(entity);
    }
    
}
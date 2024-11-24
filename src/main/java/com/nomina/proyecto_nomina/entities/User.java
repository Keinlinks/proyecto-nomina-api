package com.nomina.proyecto_nomina.entities;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    private String rut;
    private Date birth_date;
    private int salary_per_day;
    private String afp;
    private String health_system;
    private Date entry_date;
    private Date exit_date;
    private String title;
    private boolean discapacity;
    private boolean pensioned;


    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }
    public void setSalary_per_day(int salary_per_day) {
        this.salary_per_day = salary_per_day;
    }
    public void setAfp(String afp) {
        this.afp = afp;
    }
    public void setHealth_system(String health_system) {
        this.health_system = health_system;
    }
    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }
    public void setExit_date(Date exit_date) {
        this.exit_date = exit_date;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDiscapacity(boolean discapacity) {
        this.discapacity = discapacity;
    }
    public void setPensioned(boolean pensioned) {
        this.pensioned = pensioned;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getRut() {
        return rut;
    }
    public Date getBirth_date() {
        return birth_date;
    }
    public int getSalary_per_day() {
        return salary_per_day;
    }
    public String getAfp() {
        return afp;
    }
    public String getHealth_system() {
        return health_system;
    }
    public Date getEntry_date() {
        return entry_date;
    }
    public Date getExit_date() {
        return exit_date;
    }
    public String getTitle() {
        return title;
    }
    public boolean isDiscapacity() {
        return discapacity;
    }
    public boolean isPensioned() {
        return pensioned;
    }
}

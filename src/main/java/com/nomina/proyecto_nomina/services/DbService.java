package com.nomina.proyecto_nomina.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nomina.proyecto_nomina.entities.Payroll;
import com.nomina.proyecto_nomina.entities.User;
import com.nomina.proyecto_nomina.interfaces.PayrollRepository;
import com.nomina.proyecto_nomina.interfaces.UserRepository;

@Service
public class DbService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PayrollRepository payrollRepository;

    public User saveUser(User user) {
        return userRepository.insert(user);
    }

    public List<User> findAllUsers(int page, int size) {
        Pageable pageable = Pageable.ofSize(size).withPage(page);
        return userRepository.findAll(pageable).getContent();
    }

    public Payroll savePayroll(Payroll payroll) {
        return payrollRepository.save(payroll);
    }
    public Payroll findPayrollByRut(String rut) {
        Optional<Payroll> existingPayroll = payrollRepository.findByRut(rut);
        if (!existingPayroll.isPresent()) {
            return null;
        }
        return existingPayroll.get(); 
    }

    public Payroll updatePayroll(Payroll payroll) {
        Optional<Payroll> existingPayroll = payrollRepository.findByRut(payroll.getRut());
        if (!existingPayroll.isPresent()) {
            throw new RuntimeException("Payroll not found");
        }
        Payroll updatedPayroll = existingPayroll.get();

        updatedPayroll.setAfp(payroll.getAfp());
        updatedPayroll.setAfp_tax(payroll.getAfp_tax());
        updatedPayroll.setBonus(payroll.getBonus());
        updatedPayroll.setDay_worked(payroll.getDay_worked());
        updatedPayroll.setExtra_hours(payroll.getExtra_hours());
        updatedPayroll.setExtra_price_per_hour(payroll.getExtra_price_per_hour());
        updatedPayroll.setHealth_system(payroll.getHealth_system());
        updatedPayroll.setHealth_system_tax(payroll.getHealth_system_tax());
        updatedPayroll.setImponible_rent(payroll.getImponible_rent());
        updatedPayroll.setImponible_salary(payroll.getImponible_salary());
        updatedPayroll.setLiquid_salary(payroll.getLiquid_salary());
        updatedPayroll.setRent_tax(payroll.getRent_tax());
        updatedPayroll.setRut(payroll.getRut());
        updatedPayroll.setSalary_per_day(payroll.getSalary_per_day());
        return payrollRepository.save(updatedPayroll);
    }

    public User updateUser(User user) {
        Optional<User> existingUser = userRepository.findByRut(user.getRut());
        if (!existingUser.isPresent()) {
            return null;
        }
        User updatedUser = existingUser.get();

        updatedUser.setAfp(user.getAfp());
        updatedUser.setAfp(user.getAfp());
        updatedUser.setBirth_date(user.getBirth_date());
        updatedUser.setDiscapacity(user.isDiscapacity());
        updatedUser.setEntry_date(user.getEntry_date());
        updatedUser.setExit_date(user.getExit_date());
        updatedUser.setHealth_system(user.getHealth_system());
        updatedUser.setName(user.getName());
        updatedUser.setPensioned(user.isPensioned());
        updatedUser.setRut(user.getRut());
        updatedUser.setSalary_per_day(user.getSalary_per_day());
        updatedUser.setTitle(user.getTitle());
        return userRepository.save(updatedUser);
    }

}

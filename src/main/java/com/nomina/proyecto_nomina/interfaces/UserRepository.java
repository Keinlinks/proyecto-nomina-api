package com.nomina.proyecto_nomina.interfaces;
import com.nomina.proyecto_nomina.entities.*;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByName(String name);
    Optional<User> findByRut(String id);
    Page<User> findAll(Pageable pageable);
    User insert(User user);
    User save(User user);


}

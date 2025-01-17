package com.estagio.curso.services;

import com.estagio.curso.entities.user;
import com.estagio.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<user> findAll() {
        return repository.findAll();
    }

    public user findById(Long id) {
        Optional<user> obj = repository.findById(id);
        return obj.get();
    }
}

package com.estagio.curso.repositories;

import com.estagio.curso.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,Long> {

}

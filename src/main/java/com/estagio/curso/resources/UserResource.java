package com.estagio.curso.resources;


import com.estagio.curso.entities.user;
import org.apache.catalina.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserResource {

    @GetMapping
    public ResponseEntity<user> finddAll(){
        user u = new user(1L, "Gustavo", "Gust@gmail.com", "9999999","1234");
        return ResponseEntity.ok().body(u);

    }


}

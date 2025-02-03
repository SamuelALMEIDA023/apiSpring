package com.samdev.study.resources;

import com.samdev.study.entities.User;
import com.samdev.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //Para mostrar que meu resource está controlado pelo Rest
@RequestMapping(value = "/users") //devolve um caminho
public class UserResource {

    @Autowired
    private UserService service;
    //para testar se está funcionando,
    // crio um metodo que sera um endpoint p/ acessar os usuarios
    @GetMapping // mostrar que quero fazer uma requisicao GET (chamar)
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

package com.samdev.study.resources;

import com.samdev.study.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController //Para mostrar que meu resource está controlado pelo Rest
@RequestMapping(value = "/users") //devolve um caminho
public class UserResource {

    //para testar se está funcionando,
    // crio um metodo que sera um endpoint p/ acessar os usuarios
    @GetMapping // mostrar que quero fazer uma requisicao GET (chamar)
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Marcos","marcoscdc@gmail.com","999999","jesus10@");
        return ResponseEntity.ok().body(u);
    }
}

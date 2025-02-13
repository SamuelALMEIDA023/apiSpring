package com.samdev.study.resources;

import com.samdev.study.entities.User;
import com.samdev.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController //Para mostrar que meu resource está controlado pelo Rest
@RequestMapping(value = "/users") //devolve um caminho
public class UserResource {

    @Autowired
    private UserService service;
    //para testar se está funcionando,
    // crio um metodo que sera um endpoint p/ acessar os usuarios (Recuperar dados do BD)
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

    //Inserindo novo recurso ao BD
    @PostMapping
    // metodo Response com a anotattion @RequestBody que pega JSON da requisição e tranforma para obj User
    public ResponseEntity<User> insert(@RequestBody User obj) {
        User newUser = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(newUser.getId()).toUri();
        return ResponseEntity.created(uri).body(newUser);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User obj) {
        obj = service.upadate(id, obj);
        return ResponseEntity.ok().body(obj);
    }
}

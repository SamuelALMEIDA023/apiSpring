package com.samdev.study.resources;

import com.samdev.study.entities.Order;
import com.samdev.study.entities.User;
import com.samdev.study.services.OrderService;
import com.samdev.study.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //Para mostrar que meu resource está controlado pelo Rest
@RequestMapping(value = "/orders") //devolve um caminho
public class OrderResource {

    @Autowired
    private OrderService service;
    //para testar se está funcionando,
    // crio um metodo que sera um endpoint p/ acessar os usuarios
    @GetMapping // mostrar que quero fazer uma requisicao GET (chamar)
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

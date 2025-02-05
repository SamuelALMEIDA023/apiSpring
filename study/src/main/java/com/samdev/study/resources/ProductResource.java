package com.samdev.study.resources;

import com.samdev.study.entities.Category;
import com.samdev.study.entities.Product;
import com.samdev.study.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController //Para mostrar que meu resource está controlado pelo Rest
@RequestMapping(value = "/products") //devolve um caminho
public class ProductResource {

    @Autowired
    private ProductService service;

    //para testar se está funcionando,
    // crio um metodo que sera um endpoint p/ acessar os usuarios
    @GetMapping // mostrar que quero fazer uma requisicao GET (chamar)
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
        Product obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}

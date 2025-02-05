package com.samdev.study.services;

import com.samdev.study.entities.Category;
import com.samdev.study.entities.Product;
import com.samdev.study.repositories.CategoryRepository;
import com.samdev.study.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

// para essa classe funcionar ela precisa do componente service ou component
@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}

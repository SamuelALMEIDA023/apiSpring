package com.samdev.study.services;

import com.samdev.study.entities.Order;
import com.samdev.study.entities.User;
import com.samdev.study.repositories.OrderRepository;
import com.samdev.study.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// para essa classe funcionar ela precisa do componente service ou component
@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
       return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}

package com.samdev.study.services;

import com.samdev.study.entities.User;
import com.samdev.study.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// para essa classe funcionar ela precisa do componente service ou component
@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
       return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public User upadate(Long id, User obj) {
        //entidade monitorada pelo JPA
        User entity = repository.getReferenceById(id);
        // atualizando dados do meu entity baseado nos dados obj
        updateData(entity, obj);
        return repository.save(entity);
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}

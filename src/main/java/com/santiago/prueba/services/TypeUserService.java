package com.santiago.prueba.services;

import java.util.List;
import org.springframework.stereotype.Service;

import com.santiago.prueba.entities.TypeUser;
import com.santiago.prueba.repositories.TypeUserRepository;

@Service
public class TypeUserService {
    private final TypeUserRepository typeUserRepository;

    public TypeUserService(TypeUserRepository typeUserRepository) {
        this.typeUserRepository = typeUserRepository;
    }

    public TypeUser saveTypeUser(TypeUser typeUser) {
        return typeUserRepository.save(typeUser);
    }

    public List<TypeUser> getAllTypeUsers() {
        return typeUserRepository.findAll();
    }

    public TypeUser getTypeUserById(Long id) {
        return typeUserRepository.findById(id).orElse(null);
    }

    public void deleteTypeUser(Long id) {
        typeUserRepository.deleteById(id);
    }
}
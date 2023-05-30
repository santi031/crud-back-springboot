package com.santiago.prueba.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santiago.prueba.entities.TypeUser;
import com.santiago.prueba.services.TypeUserService;

@CrossOrigin("*")
@RestController
@RequestMapping("/type-users")
public class TypeUserController {
    private final TypeUserService typeUserService;

    public TypeUserController(TypeUserService typeUserService) {
        this.typeUserService = typeUserService;
    }

    @PostMapping("/create/type/user")
    public TypeUser createTypeUser(@RequestBody TypeUser typeUser) {
        return typeUserService.saveTypeUser(typeUser);
    }

    @GetMapping("/get/all")
    public List<TypeUser> getAllTypeUsers() {
        return typeUserService.getAllTypeUsers();
    }

    @GetMapping("get/{id}")
    public TypeUser getTypeUserById(@PathVariable Long id) {
        return typeUserService.getTypeUserById(id);
    }

    @DeleteMapping("delete/{id}")
    public void deleteTypeUser(@PathVariable Long id) {
        typeUserService.deleteTypeUser(id);
    }
}

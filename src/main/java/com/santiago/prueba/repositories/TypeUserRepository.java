package com.santiago.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santiago.prueba.entities.TypeUser;

@Repository
public interface TypeUserRepository extends JpaRepository<TypeUser, Long> {
}

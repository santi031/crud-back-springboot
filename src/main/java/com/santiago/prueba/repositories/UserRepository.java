package com.santiago.prueba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.santiago.prueba.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

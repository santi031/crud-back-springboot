package com.santiago.prueba.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsers;
    
    private String name;
    private String lastname;
    private Long phone;
    private String email;
    
    @ManyToOne
    @JoinColumn(name = "idTypeUser")
    private TypeUser typeUser;
    
}

package com.blog.api.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer roleId;

    private String roleName;

//    @ManyToMany(mappedBy = "roles")
//    private Set<User> users = new HashSet<>();
}

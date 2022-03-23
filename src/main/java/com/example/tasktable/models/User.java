package com.example.tasktable.models;


import javax.persistence.*;

@Entity
@Table(name = "user",uniqueConstraints = {@UniqueConstraint(columnNames = "username")})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    @Column(name="username",nullable = false)
    private String username;
    @Column(name = "password",nullable = false)
    private String password;

}

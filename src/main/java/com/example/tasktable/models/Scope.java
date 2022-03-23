package com.example.tasktable.models;


import javax.persistence.*;

@Entity
@Table(name = "scope")
public class Scope {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long scope_id;
    @Column(name = "nomScope",nullable = false)
    private String nomScope;
}

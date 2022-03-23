package com.example.tasktable.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "task")

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long task_id;
    @Column(name = "nomTask",nullable = false)
    private String nomTask;
    @Column(name = "descipcion")
    private String descipcion;
    @Column(name = "completada")
    private boolean completada;
    @Column(name = "fechaInicio")
    private Date fechaInicio;
    @Column(name = "fechaFin")
    private Date fechaFin;

}

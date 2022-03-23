package com.example.tasktable.models;


import javax.persistence.*;

@Entity
@Table(name = "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long board_Id;
    @Column(name = "nombre",nullable = false)
    private String nombre;

    public Board() {
    }

    public Board(long board_Id, String nombre) {
        this.board_Id = board_Id;
        this.nombre = nombre;
    }

    public long getBoard_Id() {
        return board_Id;
    }

    public void setBoard_Id(long board_Id) {
        this.board_Id = board_Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

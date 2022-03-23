package com.example.tasktable.DTO;


import javax.persistence.GenerationType;
import javax.persistence.Id;
public class BoardDTO {

    private long board_Id;
    private String nombre;

    public BoardDTO() {
    }

    public long getBoard_Id() {
        return board_Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setBoard_Id(long board_Id) {
        this.board_Id = board_Id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

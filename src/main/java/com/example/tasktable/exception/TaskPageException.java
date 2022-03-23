package com.example.tasktable.exception;

import org.springframework.http.HttpStatus;

public class TaskPageException extends RuntimeException{
    private static final long serialVersionUID=1L;
    private HttpStatus estado;
    private String mensajes;

    public TaskPageException(HttpStatus estado,String mensajes){
        this.estado=estado;
        this.mensajes=mensajes;
    }
    public TaskPageException(HttpStatus estado,String mensajes,String mensajes1){
        this.estado=estado;
        this.mensajes=mensajes;
        this.mensajes=mensajes1;
    }


    public HttpStatus getEstado() {
        return estado;
    }

    public void setEstado(HttpStatus estado) {
        this.estado = estado;
    }

    public String getMensajes() {
        return mensajes;
    }

    public void setMensajes(String mensajes) {
        this.mensajes = mensajes;
    }
}

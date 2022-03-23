package com.example.tasktable.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends  RuntimeException{
    private static final long serialVersionUID= 1L;

    private String nombreDelRecurso;
    private String nombreDelCampo;
    private long valorDelcampo;

    public ResourceNotFoundException(String nombreDelRecurso,String nombreDelCampo,long valorDelcampo){
        super(String.format("%s No encontrado con : %s : '%s' ",nombreDelRecurso,nombreDelCampo,valorDelcampo));
        this.nombreDelRecurso=nombreDelRecurso;
        this.nombreDelCampo=nombreDelCampo;
        this.valorDelcampo=valorDelcampo;
    }

    public String getNombreDelRecurso() {
        return nombreDelRecurso;
    }

    public void setNombreDelRecurso(String nombreDelRecurso) {
        this.nombreDelRecurso = nombreDelRecurso;
    }

    public String getNombreDelCampo() {
        return nombreDelCampo;
    }

    public void setNombreDelCampo(String nombreDelCampo) {
        this.nombreDelCampo = nombreDelCampo;
    }

    public long getValorDelcampo() {
        return valorDelcampo;
    }

    public void setValorDelcampo(long valorDelcampo) {
        this.valorDelcampo = valorDelcampo;
    }
}

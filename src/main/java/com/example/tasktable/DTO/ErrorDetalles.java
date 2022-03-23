package com.example.tasktable.DTO;

import java.util.Date;


    public class ErrorDetalles {
        private Date marcaDetiempo;
        private String mensaje;
        private String detalles;

        public ErrorDetalles(Date marcaDetiempo, String mensaje, String detalles) {
            this.marcaDetiempo = marcaDetiempo;
            this.mensaje = mensaje;
            this.detalles = detalles;
        }

        public Date getMarcaDetiempo() {
            return marcaDetiempo;
        }

        public void setMarcaDetiempo(Date marcaDetiempo) {
            this.marcaDetiempo = marcaDetiempo;
        }

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getDetalles() {
            return detalles;
        }

        public void setDetalles(String detalles) {
            this.detalles = detalles;
        }
    }


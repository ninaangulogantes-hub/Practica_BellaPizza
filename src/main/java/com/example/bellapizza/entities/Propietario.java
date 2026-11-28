package com.example.bellapizza.entities;

public class Propietario {
    private String usuario;
    private String correo;

    public Propietario(String usuario, String correo) {
        this.usuario = "alvarotc";
        this.correo = "alvarotc@bellapizza.com";
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}

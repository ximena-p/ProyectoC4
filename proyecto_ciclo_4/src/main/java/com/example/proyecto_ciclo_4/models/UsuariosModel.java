package com.example.proyecto_ciclo_4.models;

import org.springframework.data.annotation.Id;

public class UsuariosModel {

    @Id
    private String Id;
    private String Nombres;
    private String Apellidos;
    private String Telefono;
    private String Correo;
    private String Contraseña;

    public UsuariosModel() {
    }

    public UsuariosModel(String id, String nombres, String apellidos, String telefono, String correo, String contraseña) {
        Id = id;
        Nombres = nombres;
        Apellidos = apellidos;
        Telefono = telefono;
        Correo = correo;
        Contraseña = contraseña;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }
}

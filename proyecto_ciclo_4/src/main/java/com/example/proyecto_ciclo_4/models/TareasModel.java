package com.example.proyecto_ciclo_4.models;

import org.springframework.data.annotation.Id;

public class TareasModel {
    
    @Id
    private String ID;
    private String Descripcion;
    private String Estado;
    private String IdUsuario;

    public TareasModel() {
    }

    public TareasModel(String iD, String descripcion, String estado, String idUsuario) {
        ID = iD;
        Descripcion = descripcion;
        Estado = estado;
        IdUsuario = idUsuario;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        IdUsuario = idUsuario;
    }
}

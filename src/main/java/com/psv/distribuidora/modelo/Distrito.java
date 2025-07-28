package com.psv.distribuidora.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "distrito")
public class Distrito {

    @Id
    @Column(name = "id_distrito")
    private Integer idDistrito;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    public Integer getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Integer idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

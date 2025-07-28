package com.psv.distribuidora.modelo;

import jakarta.persistence.*;
import org.locationtech.jts.geom.Point;

@Entity
@Table(name = "local")
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_local")
    private Integer idLocal;

    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @Column(name = "calle", nullable = false)
    private String calle;

    @Column(name = "numeracion", nullable = false)
    private String numeracion;

    @Column(name = "codigo_postal", nullable = false)
    private String codigoPostal;

    @Column(columnDefinition = "geometry(Point, 4326)", nullable = false)
    private Point geom;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_localidad", nullable = false)
    private Distrito distrito;

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(String numeracion) {
        this.numeracion = numeracion;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Point getGeom() {
        return geom;
    }

    public void setGeom(Point geom) {
        this.geom = geom;
    }

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }
}

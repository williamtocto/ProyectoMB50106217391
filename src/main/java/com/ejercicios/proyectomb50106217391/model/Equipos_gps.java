package com.ejercicios.proyectomb50106217391.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "equipos_gps")


public class Equipos_gps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "equipo")
    private String equipo;

    @Column(name = "imei")
    private Integer imei;

    @Column(name = "numero_chip")
    private Integer numero_chip;

    @Column(name = "serie")
    private String serie;

    @Column(name = "costo")
    private Double costo;

    @Column(name = "observacion")
    private String observacion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public Integer getImei() {
        return imei;
    }

    public void setImei(Integer imei) {
        this.imei = imei;
    }

    public Integer getNumero_chip() {
        return numero_chip;
    }

    public void setNumero_chip(Integer numero_chip) {
        this.numero_chip = numero_chip;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}

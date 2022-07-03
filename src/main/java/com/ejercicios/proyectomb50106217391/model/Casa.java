

package com.ejercicios.proyectomb50106217391.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "casa")


public class Casa implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    @Column(name = "propietario")
    private String propietario;

    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;

    @Column(name = "area")
    private double area;


    @Column(name = "costo_total")
    private double costo_total;


    @Column(name = "tipo_terreno")
    private String tipo_terreno;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {this.id = id;
  }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

   public double getCosto_total() {
        return costo_total;
    }

    public void setCosto_total(double costo_total) {
        this.costo_total = costo_total;
    }

    public String getTipo_terreno() {
        return tipo_terreno;
    }

    public void setTipo_terreno(String tipo_terreno) {
        this.tipo_terreno = tipo_terreno;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}


package com.ejercicios.proyectomb50106217391.model;

import javax.persistence.*;
import java.io.Serializable;


    @Entity
    @Table(name = "zapato")


    public class Zapato implements Serializable {

        private static final long serialVersionUID = 1L;
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Basic(optional = false)
        @Column(name = "id")
        private Integer id;

        @Column(name = "marca")
        private String marca;

        @Basic(optional = false)
        @Column(name = "codigo")
        private String codigo;

        @Column(name = "cantidad")
        private Integer cantidad;

        @Column(name = "costo")
        private Integer costo;


        @Column(name = "costo_total")
        private double costo_total;


        @Column(name = "tipo_zapato")
        private String tipo_zapato;


        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public Integer getCantidad() {
            return cantidad;
        }

        public void setCantidad(Integer cantidad) {
            this.cantidad = cantidad;
        }

        public double getCosto_total() {
            return costo_total;
        }

        public void setCosto_total(double costo_total) {
            this.costo_total = costo_total;
        }

        public String getTipo_zapato() {
            return tipo_zapato;
        }

        public void setTipo_zapato(String tipo_zapato) {
            this.tipo_zapato = tipo_zapato;
        }

        public Integer getCosto() {
            return costo;
        }

        public void setCosto(Integer costo) {
            this.costo = costo;
        }
    }

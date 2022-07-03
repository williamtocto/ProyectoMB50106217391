package com.ejercicios.proyectomb50106217391.service;


import com.ejercicios.proyectomb50106217391.model.Zapato;

import java.util.ArrayList;
import java.util.List;

public interface ZapatoService {

    public Zapato create(Zapato c);
    public Zapato save(Zapato zapato);
    public Zapato findById(Integer id);
    public List<Zapato> findByAll();
    public void eliminar(Integer id);
    ArrayList<Zapato> findByCodigo(String codigo);
}

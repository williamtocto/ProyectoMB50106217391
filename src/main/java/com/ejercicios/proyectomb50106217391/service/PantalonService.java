package com.ejercicios.proyectomb50106217391.service;

import com.ejercicios.proyectomb50106217391.model.Pantalon;
import com.ejercicios.proyectomb50106217391.model.Zapato;

import java.util.ArrayList;
import java.util.List;

public interface PantalonService {

    public Pantalon create(Pantalon c);
    public Pantalon save(Pantalon Pantalon);
    public Pantalon findById(Integer id);
    public List<Pantalon> findByAll();
    public void eliminar(Integer id);
    ArrayList<Pantalon> findByCodigo(String codigo);

}

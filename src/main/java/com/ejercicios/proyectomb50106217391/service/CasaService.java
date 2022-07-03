package com.ejercicios.proyectomb50106217391.service;

import com.ejercicios.proyectomb50106217391.model.Casa;

import java.util.ArrayList;
import java.util.List;

public interface CasaService {

    public Casa create(Casa c);
    public Casa save(Casa casa);
    public Casa findById(Integer id);
    public List<Casa> findByAll();
    public void eliminar(Integer id);
    ArrayList<Casa> findByCodigo(String codigo);
}

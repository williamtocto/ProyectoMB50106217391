package com.ejercicios.proyectomb50106217391.service;


import com.ejercicios.proyectomb50106217391.model.Casa;
import com.ejercicios.proyectomb50106217391.model.Pantalon;
import com.ejercicios.proyectomb50106217391.model.Zapato;
import com.ejercicios.proyectomb50106217391.repository.PantalonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PantalonServiceImpl implements PantalonService{

    @Autowired
    PantalonRepository pantalonRepository;

    @Override
    public Pantalon create(Pantalon p) {
        return pantalonRepository.save(p);
    }

    @Override
    public Pantalon save(Pantalon pantalon) {
        return pantalonRepository.save(pantalon);
    }

    @Override
    public Pantalon findById(Integer id) {
        return pantalonRepository.findById(id).orElse(new Pantalon());
    }

    @Override
    public List<Pantalon> findByAll() {
        return pantalonRepository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
        pantalonRepository.deleteById(id);
    }

    @Override
    public ArrayList<Pantalon> findByCodigo(String codigo) {
        return (ArrayList<Pantalon>) pantalonRepository.findByCodigo(codigo);
    }
}

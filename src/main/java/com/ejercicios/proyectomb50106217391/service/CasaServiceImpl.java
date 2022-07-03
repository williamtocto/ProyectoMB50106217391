package com.ejercicios.proyectomb50106217391.service;

import com.ejercicios.proyectomb50106217391.model.Casa;
import com.ejercicios.proyectomb50106217391.repository.CasaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CasaServiceImpl implements CasaService {
    @Autowired
    CasaRepository casaRepository;

    @Override
    public Casa create(Casa c) {
        return casaRepository.save(c);
    }

    @Override
    public Casa save(Casa casa) {
        return casaRepository.save(casa);
    }

    @Override
    public Casa findById(Integer id) {
        return casaRepository.findById(id).orElse(new Casa());
    }

    @Override
    public List<Casa> findByAll() {
        return casaRepository.findAll();
    }


    @Override
    public void eliminar(Integer id) {
        casaRepository.deleteById(id);
    }

    @Override
    public ArrayList<Casa> findByCodigo(String codigo) {
        return (ArrayList<Casa>) casaRepository.findByCodigo(codigo);
    }


}

package com.ejercicios.proyectomb50106217391.service;
import com.ejercicios.proyectomb50106217391.model.Zapato;
import com.ejercicios.proyectomb50106217391.repository.ZapatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ZapatoServiceImpl implements ZapatoService {
    @Autowired
    ZapatoRepository zapatoRepository;

    @Override
    public Zapato create(Zapato z) {
        return zapatoRepository.save(z);
    }


    @Override
    public Zapato save(Zapato zapato) {
        return zapatoRepository.save(zapato);
    }

    @Override
    public Zapato findById(Integer id) {
        return zapatoRepository.findById(id).orElse(new Zapato());
    }

    @Override
    public List<Zapato> findByAll() {
        return zapatoRepository.findAll();
    }


    @Override
    public void eliminar(Integer id) {
        zapatoRepository.deleteById(id);
    }

    @Override
    public ArrayList<Zapato> findByCodigo(String codigo) {
        return (ArrayList<Zapato>) zapatoRepository.findByCodigo(codigo);
    }


}

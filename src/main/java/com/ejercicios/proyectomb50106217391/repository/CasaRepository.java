package com.ejercicios.proyectomb50106217391.repository;

import com.ejercicios.proyectomb50106217391.model.Casa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface CasaRepository extends JpaRepository<Casa, Integer> {

    ArrayList<Casa> findByCodigo(String codigo);

}

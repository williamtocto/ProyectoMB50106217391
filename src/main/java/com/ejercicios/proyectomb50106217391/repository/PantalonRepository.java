package com.ejercicios.proyectomb50106217391.repository;

import com.ejercicios.proyectomb50106217391.model.Pantalon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface PantalonRepository extends JpaRepository<Pantalon, Integer> {

    ArrayList<Pantalon> findByCodigo(String codigo);

}

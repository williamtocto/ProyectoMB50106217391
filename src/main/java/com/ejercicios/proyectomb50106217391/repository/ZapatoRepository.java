package com.ejercicios.proyectomb50106217391.repository;


import com.ejercicios.proyectomb50106217391.model.Zapato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface ZapatoRepository extends JpaRepository<Zapato, Integer> {

    ArrayList<Zapato> findByCodigo(String codigo);

}

package com.ejercicios.proyectomb50106217391.repository;

import com.ejercicios.proyectomb50106217391.model.Equipos_gps;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface Equipos_gpsRepository extends JpaRepository<Equipos_gps, Integer> {
    //ArrayList<Equipos_gps> findById(Integer id);
}

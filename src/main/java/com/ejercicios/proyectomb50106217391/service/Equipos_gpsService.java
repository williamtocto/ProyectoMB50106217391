package com.ejercicios.proyectomb50106217391.service;

import com.ejercicios.proyectomb50106217391.model.Equipos_gps;
import com.ejercicios.proyectomb50106217391.model.Zapato;

import java.util.ArrayList;
import java.util.List;

public interface Equipos_gpsService {

    public Equipos_gps create(Equipos_gps e);
    public Equipos_gps save(Equipos_gps equipos_gps);
    public Equipos_gps findById(Integer id);
    public List<Equipos_gps> findByAll();
    public void eliminar(Integer id);
    ArrayList<Equipos_gps> findByImei(Integer imei);
}

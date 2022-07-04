package com.ejercicios.proyectomb50106217391.service;

import com.ejercicios.proyectomb50106217391.model.Equipos_gps;
import com.ejercicios.proyectomb50106217391.repository.Equipos_gpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Equipos_gpsServiceImpl implements Equipos_gpsService{

    @Autowired
    Equipos_gpsRepository equipos_gpsRepository;

    @Override
    public Equipos_gps create(Equipos_gps e) {
        return equipos_gpsRepository.save(e);
    }

    @Override
    public Equipos_gps save(Equipos_gps equipos_gps) {
        return equipos_gpsRepository.save(equipos_gps);
    }

    @Override
    public Equipos_gps findById(Integer id) {
        return equipos_gpsRepository.findById(id).orElse(new Equipos_gps());
    }

    @Override
    public List<Equipos_gps> findByAll() {
        return equipos_gpsRepository.findAll();
    }

    @Override
    public void eliminar(Integer id) {
        equipos_gpsRepository.deleteById(id);
    }

    @Override
    public ArrayList<Equipos_gps> findByImei(Integer imei) {
        return (ArrayList<Equipos_gps>) equipos_gpsRepository.findByImei(imei);
    }
}

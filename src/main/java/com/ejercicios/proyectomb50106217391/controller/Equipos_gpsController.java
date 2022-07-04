package com.ejercicios.proyectomb50106217391.controller;

import com.ejercicios.proyectomb50106217391.model.Equipos_gps;
import com.ejercicios.proyectomb50106217391.model.Zapato;
import com.ejercicios.proyectomb50106217391.service.Equipos_gpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/equipos_gps")

public class Equipos_gpsController {

    @Autowired
    Equipos_gpsService equipos_gpsService;

    @GetMapping("/listar")
    public List<Equipos_gps> listar() {
        //Obtener la lista de Equipo
        List<Equipos_gps> lista= equipos_gpsService.findByAll();
        return lista;
    }

    @PostMapping("/crear")
    public ResponseEntity<Equipos_gps> crearUsuario(@RequestBody Equipos_gps z) {
        return new ResponseEntity<>(equipos_gpsService.create(z), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Equipos_gps> eliminarEquipos_gps(@PathVariable Integer id) {
        equipos_gpsService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public Equipos_gps actualizarZapato(@PathVariable Integer id, @RequestBody Equipos_gps e) {
        Equipos_gps equipo_actual = equipos_gpsService.findById(id);
        equipo_actual.setEquipo(e.getEquipo());
        equipo_actual.setImei(e.getImei());
        equipo_actual.setNumero_chip(e.getNumero_chip());
        equipo_actual.setSerie(e.getSerie());
        equipo_actual.setCosto(e.getCosto());
        equipo_actual.setObservacion(e.getObservacion());
        return equipos_gpsService.save(equipo_actual);

    }

    @GetMapping("/codigo/{codigo}")//id de aki
    public ArrayList<Equipos_gps> categorias(@PathVariable Integer imei) {
        ArrayList<Equipos_gps> lista= equipos_gpsService.findByImei(imei);
        return lista;
    }

}

package com.ejercicios.proyectomb50106217391.controller;

import com.ejercicios.proyectomb50106217391.model.Casa;
import com.ejercicios.proyectomb50106217391.service.CasaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/casa")
public class CasaController {

    final double  costoKilometro=80;
    @Autowired
    CasaService casaService;

    @GetMapping("/listar")
    public List<Casa> listar() {

        //Obtener la lista de Casas
      List<Casa> lista=casaService.findByAll();
      lista.stream().forEach(c-> c.setCosto_total(c.getArea()*costoKilometro));

        /*
      //Actualizar en la base
        for (int i=0;i<lista.size();i++){
            Casa casaActual = casaService.findById(lista.get(i).getId());
            casaActual.setCosto_total(casaActual.getArea()*costoKilometro);
            casaService.save(casaActual);
        }*/

      return lista;
    }

    @PostMapping("/crear")
    public ResponseEntity<Casa> crearUsuario(@RequestBody Casa u) {
      //  u.setCosto_total(calcularCosto(u.getArea()));
        return new ResponseEntity<>(casaService.create(u), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Casa> eliminarUsuario(@PathVariable Integer id) {
        casaService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public Casa actualizarCasa(@PathVariable Integer id, @RequestBody Casa c) {
        Casa casaActual = casaService.findById(id);
        casaActual.setPropietario(c.getPropietario());
        casaActual.setArea(c.getArea());
        casaActual.setCodigo(c.getCodigo());
        casaActual.setCosto_total(c.getArea()*costoKilometro);
        return casaService.save(casaActual);

    }

    @GetMapping("/codigo/{codigo}")//id de aki
    public ArrayList<Casa> categorias(@PathVariable String codigo) {

       // Obtener una lista mediante el codigo
        ArrayList<Casa> lista=casaService.findByCodigo(codigo);

        // Creo un objeto de tipo casa al cual le asigno el valor
        Casa casaActual = casaService.findById(lista.get(0).getId());
        casaActual.setCosto_total(casaActual.getArea()*costoKilometro);
        casaService.save(casaActual);

        //actulizar mi lista
        lista.stream().forEach(c-> c.setCosto_total(casaActual.getCosto_total()));

        return lista;
    }






}

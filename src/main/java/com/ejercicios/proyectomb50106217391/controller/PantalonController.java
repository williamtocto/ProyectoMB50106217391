package com.ejercicios.proyectomb50106217391.controller;


import com.ejercicios.proyectomb50106217391.model.Pantalon;
import com.ejercicios.proyectomb50106217391.model.Zapato;
import com.ejercicios.proyectomb50106217391.service.PantalonService;
import com.ejercicios.proyectomb50106217391.service.ZapatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/pantalon")
public class PantalonController {

    @Autowired
    PantalonService pantalonService;

    @GetMapping("/listar")
    public List<Pantalon> listar() {

        //Obtener la lista de Pantalon
        List<Pantalon> lista= pantalonService.findByAll();
        lista.stream().forEach(c-> c.setCosto_total(c.getCantidad()*c.getCosto()));
        //Actualizar en la base
        for (int i=0;i<lista.size();i++){
            Pantalon pantalon = pantalonService.findById(lista.get(i).getId());
            pantalon.setCosto_total(pantalon.getCantidad()* pantalon.getCosto());
            pantalonService.save(pantalon);
        }
        return lista;
    }

    @PostMapping("/crear")
    public ResponseEntity<Pantalon> crearUsuario(@RequestBody Pantalon p) {
        return new ResponseEntity<>(pantalonService.create(p), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Pantalon> eliminarPantalon(@PathVariable Integer id) {
        pantalonService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public Pantalon actualizarPantalon(@PathVariable Integer id, @RequestBody Pantalon p) {
        Pantalon pantalonActual = pantalonService.findById(id);
        pantalonActual.setMarca(p.getMarca());
        pantalonActual.setModelo(p.getModelo());
        pantalonActual.setFabricante(p.getFabricante());
        pantalonActual.setCantidad(p.getCantidad());
        pantalonActual.setCosto(p.getCosto());
        pantalonActual.setCosto_total(p.getCantidad()*p.getCosto());
        pantalonActual.setOrigen(p.getOrigen());
        return pantalonService.save(pantalonActual);

    }

    @GetMapping("/codigo/{codigo}")//id de aki
    public ArrayList<Pantalon> categorias(@PathVariable String codigo) {

        // Obtener una lista mediante el codigo
        ArrayList<Pantalon> lista= pantalonService.findByCodigo(codigo);

        // Creo un objeto de tipo casa al cual le asigno el valor
        Pantalon pantalonActual = pantalonService.findById(lista.get(0).getId());
        pantalonActual.setCosto_total(pantalonActual.getCantidad()*pantalonActual.getCosto());
        pantalonService.save(pantalonActual);

        //actulizar mi lista
        lista.stream().forEach(c-> c.setCosto_total(pantalonActual.getCosto_total()));

        return lista;
    }
}

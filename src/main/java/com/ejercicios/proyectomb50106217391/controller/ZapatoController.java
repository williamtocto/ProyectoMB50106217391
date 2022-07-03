package com.ejercicios.proyectomb50106217391.controller;


import com.ejercicios.proyectomb50106217391.model.Zapato;
import com.ejercicios.proyectomb50106217391.service.ZapatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/zapato")
public class ZapatoController {



    @Autowired
    ZapatoService zapatoService;

    @GetMapping("/listar")
    public List<Zapato> listar() {


        //Obtener la lista de Zapatos
      List<Zapato> lista= zapatoService.findByAll();
      lista.stream().forEach(c-> c.setCosto_total(c.getCantidad()*c.getCosto()));
      //Actualizar en la base
       for (int i=0;i<lista.size();i++){
            Zapato zapato = zapatoService.findById(lista.get(i).getId());
            zapato.setCosto_total(zapato.getCantidad()* zapato.getCosto());
            zapatoService.save(zapato);
        }

      return lista;
    }

    @PostMapping("/crear")
    public ResponseEntity<Zapato> crearUsuario(@RequestBody Zapato z) {
        return new ResponseEntity<>(zapatoService.create(z), HttpStatus.CREATED);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Zapato> eliminarZapato(@PathVariable Integer id) {
        zapatoService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public Zapato actualizarZapato(@PathVariable Integer id, @RequestBody Zapato c) {
        Zapato zapatoActual = zapatoService.findById(id);
        zapatoActual.setMarca(c.getMarca());
        zapatoActual.setCodigo(c.getCodigo());
        zapatoActual.setCantidad(c.getCantidad());
        zapatoActual.setCosto(c.getCosto());
        zapatoActual.setCosto_total(c.getCantidad()*c.getCosto());
        zapatoActual.setTipo_zapato(c.getTipo_zapato());

        return zapatoService.save(zapatoActual);

    }

    @GetMapping("/codigo/{codigo}")//id de aki
    public ArrayList<Zapato> categorias(@PathVariable String codigo) {

       // Obtener una lista mediante el codigo
        ArrayList<Zapato> lista= zapatoService.findByCodigo(codigo);

        // Creo un objeto de tipo casa al cual le asigno el valor
        Zapato casaActual = zapatoService.findById(lista.get(0).getId());
        casaActual.setCosto_total(casaActual.getCantidad()*casaActual.getCosto());
        zapatoService.save(casaActual);

        //actulizar mi lista
        lista.stream().forEach(c-> c.setCosto_total(casaActual.getCosto_total()));

        return lista;
    }






}

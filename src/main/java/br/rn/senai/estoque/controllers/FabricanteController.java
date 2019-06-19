package br.rn.senai.estoque.controllers;

import br.rn.senai.estoque.models.Fabricante;
import br.rn.senai.estoque.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {

    @Autowired
    private FabricanteService service;

    /*
    @GetMapping
    public List<Fabricante> findAll(){
        return service.findAll();
    }
    */

    @GetMapping
    public ResponseEntity<?> findAll(){
        List<Fabricante> fabricantes = service.findAll();
        if (fabricantes.size() == 0) {
            return ResponseEntity.noContent().build();
        }
    return  ResponseEntity.ok(fabricantes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fabricante> findById(@RequestParam Long id){
        Optional<Fabricante> fabricante = service.findFabricanteById(id);
        if (fabricante.isPresent()){
            return ResponseEntity.ok((fabricante.get()));
        }
        return ResponseEntity.notFound().build();
    }

}

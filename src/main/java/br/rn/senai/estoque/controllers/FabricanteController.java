package br.rn.senai.estoque.controllers;

import br.rn.senai.estoque.models.Fabricante;
import br.rn.senai.estoque.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    
}

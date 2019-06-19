package br.rn.senai.estoque.service;

import br.rn.senai.estoque.models.Fabricante;
import br.rn.senai.estoque.repositories.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FabricanteService {

    @Autowired
    private FabricanteRepository repository;

    public void save(Fabricante fabricante) {

        repository.save(fabricante);
    }

    public List<Fabricante> findAll(){
        return repository.findAll();
    }

    public Optional<Fabricante> findFabricanteById(Long id){
    return repository.findById(id);
    }
}

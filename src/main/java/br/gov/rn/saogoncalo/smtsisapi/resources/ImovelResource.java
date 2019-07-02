package br.gov.rn.saogoncalo.smtsisapi.resources;

import br.gov.rn.saogoncalo.smtsisapi.models.Imovel;
import br.gov.rn.saogoncalo.smtsisapi.repositories.ImovelRepository;
import org.hibernate.validator.constraints.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import javax.persistence.Id;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.xml.ws.Response;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/imoveis")
public class ImovelResource {

    @Autowired
    private ImovelRepository repository;

    @GetMapping
    public List<Imovel> getAllImoveis(){

        return repository.findAll();
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Imovel> saveImovel(@RequestBody @Valid Imovel imovel, UriComponentsBuilder local){
        repository.save(imovel);
        URI uri = local.path("/imoveis/{id}")
            .buildAndExpand(imovel.getId())
            .toUri();

        return ResponseEntity.created(uri).body(imovel);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Imovel> getById(@PathVariable Long id){
        Optional<Imovel> imovel = repository.findById(id);
        if(imovel.isPresent()){
            return ResponseEntity.ok(imovel.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<Imovel> fetchImovel(@PathVariable Long id, @RequestBody Imovel imovel){
        Optional<Imovel> imovelOptional = repository.findById(id);
        if (imovelOptional.isPresent()){
            imovel.setId(id);
            repository.save(imovel);
            return ResponseEntity.accepted().body(imovel);
        } else if (!id.equals(imovel.getId())){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.badRequest().build();
    }
}

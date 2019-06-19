package br.rn.senai.estoque.service;

import br.rn.senai.estoque.models.Usuario;
import br.rn.senai.estoque.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public void salva(Usuario usuario){

        repository.save(usuario);
    }

    public List<Usuario> findAll(){

        return repository.findAll();
    }
}

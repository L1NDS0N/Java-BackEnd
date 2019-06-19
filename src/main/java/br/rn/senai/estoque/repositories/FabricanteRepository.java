package br.rn.senai.estoque.repositories;

import br.rn.senai.estoque.models.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {

    Optional<Fabricante> findByNome(String nome);

}

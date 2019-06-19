package br.rn.senai.estoque.repositories;

import br.rn.senai.estoque.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByFabricante_Nome(String fabricante);

}

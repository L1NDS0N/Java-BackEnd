package br.gov.rn.saogoncalo.smtsisapi.repositories;

import br.gov.rn.saogoncalo.smtsisapi.models.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImovelRepository extends JpaRepository<Imovel, Long> {

    List<Imovel> findByResponsavel(String responsavel);
}

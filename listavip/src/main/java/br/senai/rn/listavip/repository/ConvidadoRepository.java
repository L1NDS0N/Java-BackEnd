package br.senai.rn.listavip.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.rn.listavip.model.Convidado;


public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{
	
}
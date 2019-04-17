package br.senai.rn.listavip.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import br.senai.rn.listavip.model.Convidado;
import br.senai.rn.listavip.repository.ConvidadoRepository;
import br.senai.rn.listavip.service.ConvidadoService;

@RestController
@RequestMapping("/lista-vip/ws")
public class ConvidadoResource {

//	@Autowired
//	private ConvidadoService service;
	
	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Convidado> buscarPeloCodigo(@PathVariable Long codigo) {
		Convidado convidado = convidadoRepository.findById(Id);
		return convidado != null ? ResponseEntity.ok(convidado) : ResponseEntity.notFound().build();
	}
//	TODO
}

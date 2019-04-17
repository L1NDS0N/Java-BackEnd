package br.senai.rn.listavip.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import br.senai.rn.listavip.model.Convidado;
import br.senai.rn.listavip.repository.ConvidadoRepository;

@Service
public class ConvidadoService {

	@Autowired
	private ConvidadoRepository repository;
	
	public void salvar(Convidado convidado) {
		if(validate(convidado)) {
			repository.save(convidado);
		}
	}
	
	public Convidado obter(Long id) {
		Optional<Convidado> convidadoBuscado = repository.findById(id);
		if(convidadoBuscado.isPresent()) {
			return convidadoBuscado.get();
		}
		return new Convidado();
	}
	
	public List<Convidado> obterTodos(){
		return repository.findAll();
	}
	
	private Boolean validate(Convidado convidado) {
		if(StringUtils.isEmpty(convidado.getNome()) ||
				StringUtils.isEmpty(convidado.getFone())) {
			return false;
		}
		return true;
	}
}

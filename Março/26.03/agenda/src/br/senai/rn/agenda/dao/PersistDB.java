package br.senai.rn.agenda.dao;

import java.util.List;

import br.senai.rn.agenda.model.Fone;

public interface PersistDB {

	void salvar();
	
	void excluir(Fone fone);
	
	void editar(Fone fone);
	
	Fone buscar();
	
	List<Fone> buscarTodos();
	
}

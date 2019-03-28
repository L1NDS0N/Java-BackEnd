package br.senai.rn.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.senai.rn.agenda.model.Contato;

public class NomeDAO {
	private static List<Contato> contatos = new ArrayList<Contato>();

	public void create(Contato contato) {
		if (!contatos.contains(contato)) {
			contatos.add(contato);
		}
	}

	public void remove(Contato contato) {
		if (contatos.contains(contato)) {
			contatos.remove(contato);
		}
	}

	public void update(Contato contatoAtual, Contato contatoNovo) {
		if (contatos.contains(contatoAtual)) {
			int index = contatos.indexOf(contatoAtual);
			contatos.set(index, contatoNovo);
		}
	}

	public Contato find(String contato) {
		for (Contato ctt : contatos) {
			if (ctt.getNome().equals(contato)) {
				return ctt;
			}
		}
		return null;
	}

	public List<Contato> buscarTodos() {
		return contatos;
	}
}

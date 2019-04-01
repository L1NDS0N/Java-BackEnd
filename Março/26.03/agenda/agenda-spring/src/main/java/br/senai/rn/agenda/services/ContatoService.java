package br.senai.rn.agenda.services;


import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.senai.rn.agenda.dao.ContatoDAO;
import br.senai.rn.agenda.model.Contato;

public class ContatoService {
	private ContatoDAO dao = new ContatoDAO();

	public Boolean salvar(Contato contato) {

		if (ObjectUtils.isEmpty(contato) || StringUtils.isEmpty(contato.getNome())) {
			dao.create(contato);
		}
		return false;
	}

	public Boolean remove(Contato contato) {
		if (ObjectUtils.isEmpty(contato) || StringUtils.isEmpty(contato.getNome())) {
			dao.remove(contato);
			return true;
		}

		return null;
	}

	public String update(Contato oldName, Contato newName) {
		if (ObjectUtils.isEmpty(oldName) || StringUtils.isEmpty(oldName.getNome())) {
			return dao.update(oldName, newName);
		}
		return null;
	}
}

package br.senai.rn.agenda.services;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import br.senai.rn.agenda.dao.ContatoDAO;
import br.senai.rn.agenda.model.Contato;

public class ContatoService {
	private ContatoDAO dao = new ContatoDAO();

	public Boolean salvar(Contato contato) {

		if (ObjectUtils.allNotNull(contato) || StringUtils.isNotEmpty(contato.getNome())) {
			dao.create(contato);
		}
		return false;
	}

	public Boolean remove(Contato contato) {
		if (ObjectUtils.allNotNull(contato) || StringUtils.isNotEmpty(contato.getNome())) {
			dao.remove(contato);
			return true;
		}

		return null;
	}

	public String update(Contato oldName, Contato newName) {
		if (ObjectUtils.allNotNull(oldName) || StringUtils.isNotEmpty(oldName.getNome())) {
			return dao.update(oldName, newName);
		}
		return null;
	}
}

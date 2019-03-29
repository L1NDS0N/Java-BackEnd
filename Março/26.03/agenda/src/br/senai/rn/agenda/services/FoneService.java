package br.senai.rn.agenda.services;


import org.apache.commons.lang3.StringUtils;

import br.senai.rn.agenda.dao.FoneDAO;
import br.senai.rn.agenda.model.Fone;

public class FoneService {
	private FoneDAO dao = new FoneDAO();
	public Boolean salvar(Fone fone) {
		if(StringUtils) {
//		if(!(fone == null || fone.getFone().trim().isEmpty())) {
			dao.create(fone);
		}
		return false;
	}
}
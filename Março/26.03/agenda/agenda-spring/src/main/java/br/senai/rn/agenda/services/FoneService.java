package br.senai.rn.agenda.services;


import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import br.senai.rn.agenda.dao.FoneDAO;
import br.senai.rn.agenda.model.Fone;

public class FoneService {
	private FoneDAO dao = new FoneDAO();
	public Boolean salvar(Fone fone) {
// ¹
		if(ObjectUtils.allNotNull(fone) || StringUtils.isNotEmpty(fone.getFone())) {
			dao.create(fone);
		}
		return false;
	}
	public Boolean remove(Fone fone) {
		if(ObjectUtils.allNotNull(fone) || StringUtils.isNotEmpty(fone.getFone())) {
			dao.remove(fone);
			return true;
		}
		
		return null;
	}
	
}
//¹		if(!(fone == null || fone.getFone().trim().isEmpty())) {
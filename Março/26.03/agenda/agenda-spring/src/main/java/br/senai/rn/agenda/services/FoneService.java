package br.senai.rn.agenda.services;



import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.senai.rn.agenda.model.Fone;
import br.senai.rn.agenda.repositories.FoneDAO;

public class FoneService {
	private FoneDAO dao = new FoneDAO();
	public Boolean salvar(Fone fone) {
// �
		if(!ObjectUtils.isEmpty(fone) || !StringUtils.isEmpty(fone.getFone())) {
			dao.create(fone);
		}
		return false;
	}
	public Boolean remove(Fone fone) {
		if(!ObjectUtils.isEmpty(fone) || !StringUtils.isEmpty(fone.getFone())) {
			dao.remove(fone);
			return true;
		}
		
		return null;
	}
	
}
//�		if(!(fone == null || fone.getFone().trim().isEmpty())) {
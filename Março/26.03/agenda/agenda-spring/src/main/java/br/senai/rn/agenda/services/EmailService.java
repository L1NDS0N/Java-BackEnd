package br.senai.rn.agenda.services;


import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import br.senai.rn.agenda.dao.EmailDAO;
import br.senai.rn.agenda.model.Email;

public class EmailService {
	private EmailDAO dao = new EmailDAO();
	public Boolean salvar(Email email) {

		if(ObjectUtils.allNotNull(email) || StringUtils.isNotEmpty(email.getEmail())) {
			dao.create(email);
		}
		return false;
	}
	public Boolean remove(Email email) {
		if(ObjectUtils.allNotNull(email) || StringUtils.isNotEmpty(email.getEmail())) {
			dao.remove(email);
			return true;
		}
		
		return null;
	}
	
}

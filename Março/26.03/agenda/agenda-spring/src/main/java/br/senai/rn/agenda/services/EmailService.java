package br.senai.rn.agenda.services;




import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import br.senai.rn.agenda.dao.EmailDAO;
import br.senai.rn.agenda.model.Email;

public class EmailService {
	private EmailDAO dao = new EmailDAO();
	public Boolean salvar(Email email) {

		if(!ObjectUtils.isEmpty(email) || !StringUtils.isEmpty(email.getEmail())) {
			dao.create(email);
		}
		return false;
	}
	public Boolean remove(Email email) {
		if(!ObjectUtils.isEmpty(email) || !StringUtils.isEmpty(email.getEmail())) {
			dao.remove(email);
			return true;
		}
		
		return null;
	}
	
}

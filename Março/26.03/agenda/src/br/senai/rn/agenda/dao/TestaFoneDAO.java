package br.senai.rn.agenda.dao;

import br.senai.rn.agenda.model.Email;
import br.senai.rn.agenda.model.Fone;
import br.senai.rn.agenda.model.enums.TipoEmail;
import br.senai.rn.agenda.model.enums.TipoFone;

public class TestaFoneDAO {

	public static void main(String[] args) {
		EmailDAO edao = new EmailDAO();
		ContatoDAO cdao = new ContatoDAO();
		FoneDAO fdao = new FoneDAO();
		
		Fone f1 = new Fone();
		f1.setFone("2222-3333");
		f1.setTipoFone(TipoFone.CELULAR);
		fdao.create(f1);
		
		System.out.println(fdao.findAll());
		
		Email e1 = new Email();
		e1.setEmail("iajdsaoisdioj@hotmail.com");
		e1.setTipoEmail(TipoEmail.PESSOAL);
		
		System.out.println(edao.findAll());
	}

}

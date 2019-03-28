package br.senai.rn.agenda.dao;

import br.senai.rn.agenda.model.Fone;
import br.senai.rn.agenda.model.enums.TipoFone;

public class TestaFoneDAO {

	public static void main(String[] args) {
		FoneDAO dao = new FoneDAO();
		
		Fone f1 = new Fone();
		f1.setFone("2222-3333");
		f1.setTipoFone(TipoFone.CELULAR);
		dao.create(f1);
		
		System.out.println(dao.findAll());
	}

}

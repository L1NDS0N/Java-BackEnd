package br.senai.rn.agenda.dao;

import br.senai.rn.agenda.model.Fone;
import br.senai.rn.agenda.model.enums.TipoFone;

public class TestaFoneDAO {

	public static void main(String[] args) {

		FoneDAO dao = new FoneDAO();
		
		dao.salvar(new Fone("1111-1111", TipoFone.FIXO));
		dao.salvar(new Fone("2222-4444", TipoFone.FIXO));
		
		System.out.println(dao.buscarTodos());
		
		dao.editar(new Fone("1111-1111", TipoFone.FIXO), new Fone("9999-1111", TipoFone.CELULAR));

		System.out.println(dao.buscarTodos());
	
	}

}

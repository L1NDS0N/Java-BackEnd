package br.senai.rn.agenda.dao;

import java.util.List;
import java.util.List;

import br.senai.rn.agenda.model.Fone;

public class FoneDAO extends GenericDAO<Fone>{

	public Fone findByFone(String fone) {
		List<Fone> fones = super.findAll();
		for (Fone f : fones) {
			if (f.getFone().equals(fone)) {
			return f;
			}
		}
		return null;
	}
	
}

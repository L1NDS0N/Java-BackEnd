package br.senai.rn.agenda.dao;

import java.util.ArrayList;
import java.util.List;

import br.senai.rn.agenda.model.Email;

public class EmailDAO {
	private static List<Email> emails = new ArrayList<Email>();

	public void create(Email email) {
		if (!emails.contains(email)) {
			emails.add(email);
		}
	}

	public void remove(Email email) {
		if (emails.contains(email)) {
			emails.remove(email);
		}
	}

	public void update(Email emailAtual, Email emailNovo) {
		if (emails.contains(emailAtual)) {
			int index = emails.indexOf(emailAtual);
			emails.set(index, emailNovo);
		}
	}

	public Email find(String email) {
		for (Email eml : emails) {
			if (eml.getEmail().equals(email)) {
				return eml;
			}
		}
		return null;
	}

	public List<Email> buscarTodos() {
		return emails;
	}
}

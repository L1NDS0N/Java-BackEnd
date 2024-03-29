package br.senai.rn.agenda.model;

import br.senai.rn.agenda.dao.PersistDB;
import br.senai.rn.agenda.model.enums.TipoEmail;

public class Email implements PersistDB{

	private Long id;
	private String email;
	private TipoEmail tipoEmail;
	
	public Email() {}
	
	public Email(Long id, String email, TipoEmail tipoEmail) {
		this.email = email;
		this.tipoEmail = tipoEmail;
	}
	@Override
	public Long getId() {
		return id;
	}
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TipoEmail getTipoEmail() {
		return tipoEmail;
	}

	public void setTipoEmail(TipoEmail tipoEmail) {
		this.tipoEmail = tipoEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Email other = (Email) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Email [id=" + id + ", email=" + email + ", tipoEmail=" + tipoEmail + "]";
	}

	
	
}

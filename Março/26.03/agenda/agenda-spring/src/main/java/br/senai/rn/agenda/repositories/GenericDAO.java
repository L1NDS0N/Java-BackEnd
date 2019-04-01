package br.senai.rn.agenda.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public abstract class GenericDAO<T extends PersistDB> {

	private List<T> ts = new ArrayList<T>();

	public boolean create(T t) {
		if (!ts.contains(t)) {
			t.setId(new Long(ts.size()));
			ts.add(t);
			return true;
		}
		return false;
	}

	public Boolean remove(T t) {
		if (ts.contains(t)) {
			ts.remove(t);
			return true;
		}
		return false;
	}

	public T findById(Long id) {
		for (T t : ts) {
			if (t.getId().equals(id)) {
				return t;
			}
		}
		return null;
	}

	public List<T> findAll() {
		return ts;
	}

	public String update(T oldName, T newName) {
		if (!ts.contains(oldName)) {
			for (T t : ts) {
				ts.set(ts.indexOf(oldName), newName);
			}
		}
		return null;
	}

}

package com.bookadvisor.dao;

import java.util.List;

import com.bookadvisor.dao.model.Libreria;

public interface LibreriaDAO {

	public void create(Libreria libreria);
	public Libreria read(String email);
	public Libreria update(Libreria libreria);
	public void delete(Libreria libreria);
	public List<Libreria> getAll();
	public Libreria login(String email, String password);

}

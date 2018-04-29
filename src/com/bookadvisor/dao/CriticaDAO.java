package com.bookadvisor.dao;

import java.util.List;

import com.bookadvisor.dao.model.Critica;

public interface CriticaDAO {
	
	public void create(Critica critica);
	public Critica read(String titulo);
	public Critica update(Critica critica);
	public void delete(Critica critica);
	public List<Critica> getAll();

}
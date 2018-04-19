package com.bookadvisor.dao;

import java.util.List;

import com.bookadvisor.dao.model.FichaLibro;

public interface FichaLibroDAO {

	public void create(FichaLibro ficha);
	public FichaLibro read(String titulo);
	public FichaLibro update(FichaLibro ficha);
	public void delete(FichaLibro ficha);
	public List<FichaLibro> getAll();

}

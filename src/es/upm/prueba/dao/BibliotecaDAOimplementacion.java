package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.Biblioteca;

public interface BibliotecaDAO {
	
	public void create(Biblioteca biblioteca);
	public Biblioteca read(String titulo);
	public Biblioteca update(Biblioteca biblioteca);
	public void delete(Biblioteca biblioteca);
	public List<Biblioteca> getAll();

}

package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.Biblioteca;

public class BibliotecaDAOimplementation implements BibliotecaDAO {
	public static BibliotecaDAOimplementation instance;
	private BibliotecaDAOimplementation() { }
	public static BibliotecaDAOimplementation getInstance() {
		if ( null == instance )
			instance = new BibliotecaDAOimplementacion();
		return instance;
	}
	
	public void create(Biblioteca biblioteca);
	public Biblioteca read(String titulo);
	public Biblioteca update(Biblioteca biblioteca);
	public void delete(Biblioteca biblioteca);
	public List<Biblioteca> getAll();

}

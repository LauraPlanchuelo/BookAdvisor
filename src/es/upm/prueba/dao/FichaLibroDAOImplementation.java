
package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.FichaLibro;

public interface FichaLibroDAOImplementation implements FichaLibroDAO{
	public static BibliotecaDAOimplementation instance;
	private BibliotecaDAOimplementation() { }
	public static BibliotecaDAOimplementation getInstance() {
		if ( null == instance )
			instance = new BibliotecaDAOimplementacion();
		return instance;
	}

	public void create(FichaLibro ficha);
	public FichaLibro read(String titulo);
	public FichaLibro update(FichaLibro ficha);
	public void delete(FichaLibro ficha);
	public List<FichaLibro> getAll();

}

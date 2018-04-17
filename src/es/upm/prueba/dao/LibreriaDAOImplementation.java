
package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.Libreria;

public interface LibreriaDAOImplementation implements LibreriaDAO {
	public static BibliotecaDAOimplementation instance;
	private BibliotecaDAOimplementation() { }
	public static BibliotecaDAOimplementation getInstance() {
		if ( null == instance )
			instance = new BibliotecaDAOimplementacion();
		return instance;
	}

	public void create(Libreria libreria);
	public Libreria read(String email);
	public Libreria update(Libreria libreria);
	public void delete(Libreria libreria);
	public List<Libreria> getAll();
	public Libreria login(String email, String password);

}

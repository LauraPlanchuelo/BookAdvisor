
package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.Lector;

public interface LectorDAOImplementation implements LectorDAO {
	public static BibliotecaDAOimplementation instance;
	private BibliotecaDAOimplementation() { }
	public static BibliotecaDAOimplementation getInstance() {
		if ( null == instance )
			instance = new BibliotecaDAOimplementacion();
		return instance;
	}

	public void create(Lector lector);
	public Lector read(String email);
	public Lector update(Lector lector);
	public void delete(Lector lector);
	public List<Lector> getAll();
	public Lector login(String email, String password);

}

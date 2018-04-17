
package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.Libreria;

public interface LibreriaDAOImplementation implements LibreriaDAO {

	public void create(Libreria libreria);
	public Libreria read(String email);
	public Libreria update(Libreria libreria);
	public void delete(Libreria libreria);
	public List<Libreria> getAll();
	public Libreria login(String email, String password);

}


package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.FichaLibro;

public interface FichaLibroDAOImplementation implements FichaLibroDAO{

	public void create(FichaLibro ficha);
	public FichaLibro read(String titulo);
	public FichaLibro update(FichaLibro ficha);
	public void delete(FichaLibro ficha);
	public List<FichaLibro> getAll();

}

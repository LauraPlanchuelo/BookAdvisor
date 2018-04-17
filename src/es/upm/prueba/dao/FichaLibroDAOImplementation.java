
package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.FichaLibro;

public interface FichaLibroDAOImplementation implements FichaLibroDAO{
	public static FichaLibroDAOimplementation instance;
	private FichaLibroDAOimplementation() { }
	public static FichaLibroDAOimplementation getInstance() {
		if ( null == instance )
			instance = new FichaLibroDAOimplementacion();
		return instance;
	}

	public void create(FichaLibro ficha){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(ficha);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
				session.close();
		}
		
	public FichaLibro read(String titulo);
	public FichaLibro update(FichaLibro ficha);
	public void delete(FichaLibro ficha);
	public List<FichaLibro> getAll();

}

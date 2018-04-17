
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
	public Libreria login(String email, String password){
		Session session = SessionFactoryService.get().openSession();
		Libreria libreria = null;
		try {
			session.beginTransaction();
			tfg = (TFG) session.createQuery (
			“select t from TFG t where t.email= :email and t.password= :password”).
				
			.setParameter(“email”, email).
			.setParameter(“password”, password).uniqueResult();
				session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return libreria;
	}
	

}

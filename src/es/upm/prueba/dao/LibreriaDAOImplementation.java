
package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.Libreria;

public interface LibreriaDAOImplementation implements LibreriaDAO {
	public static LibreriaDAOimplementation instance;
	private LibreriaDAOimplementation() { }
	public static LibreriaDAOimplementation getInstance() {
		if ( null == instance )
			instance = new LibreriaDAOimplementacion();
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
			libreria = (Libreria) session.createQuery (
			“select t from Libreria t where t.email= :email and t.password= :password”).
				
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

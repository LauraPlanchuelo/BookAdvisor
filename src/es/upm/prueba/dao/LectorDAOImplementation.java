
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
	public Lector login(String email, String password){
		Session session = SessionFactoryService.get().openSession();
		Lector lector = null;
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
		return lector;
	}

}

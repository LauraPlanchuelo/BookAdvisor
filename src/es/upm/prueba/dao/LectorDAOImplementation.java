
package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.Lector;

public interface LectorDAOImplementation implements LectorDAO {
	public static LectorDAOimplementation instance;
	private LectorDAOimplementation() { }
	public static LectorDAOimplementation getInstance() {
		if ( null == instance )
			instance = new LectorDAOimplementacion();
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
			lector = (Lector) session.createQuery (
			“select t from Lector t where t.email= :email and t.password= :password”).
				
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

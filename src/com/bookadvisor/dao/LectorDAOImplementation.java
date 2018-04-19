
package com.bookadvisor.dao;

import java.util.List;

import com.bookadvisor.dao.model.Lector;

public interface LectorDAOImplementation implements LectorDAO {
	public static LectorDAOimplementation instance;
	private LectorDAOimplementation() { }
	public static LectorDAOimplementation getInstance() {
		if ( null == instance )
			instance = new LectorDAOimplementacion();
		return instance;
	}

	public Lector read(String titulo){
		Session session = SessionFactoryService.get().openSession();
		Lector lector = null;
		try {
			lector = session.get(lector.class, titulo);
		} catch (Exception e) {
		} finally {
			session.close();
		}		
		return libro;
	}		
	public void update(Lector lector){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(ficha);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
	}
	public void delete(Lector lector){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(lector);
			session.getTransaction().commit();
		} catch (Exception e) {
		// TODO: handle exception
		} finally {
		session.close();
		}
	}
	public List<Lector> getAll(){
		Session session = SessionFactoryService.get().openSession();
		List<Lector> fichas = new ArrayList<>();
		try {
			session.beginTransaction();
			fichas.addAll(session.createQuery("select t from FichaLibro t”).getResultList());
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return fichas;
	}

	public Lector login(String email, String password){
		Session session = SessionFactoryService.get().openSession();
		Lector lector = null;
		try {
			session.beginTransaction();
			lector = (Lector) session.createQuery (“select t from Lector t where t.email= :email and t.password= :password”).
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

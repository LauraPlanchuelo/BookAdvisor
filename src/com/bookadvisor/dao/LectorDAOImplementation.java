package com.bookadvisor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.bookadvisor.dao.model.Lector;

public class LectorDAOImplementation implements LectorDAO {
	
	public static LectorDAOImplementation instance;
	private LectorDAOImplementation() { }
	public static LectorDAOImplementation getInstance() {
		if ( null == instance )
			instance = new LectorDAOImplementation ();
		return instance;
	}

	@Override
	public void create(Lector lector) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(lector);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
				session.close();
		}
	}

	@Override
	public Lector read(String titulo){
		Session session = SessionFactoryService.get().openSession();
		Lector lector = null;
		try {
			lector = session.get(Lector.class, titulo);
		} catch (Exception e) {
		} finally {
			session.close();
		}		
		return lector;
	}		

	@Override
	public Lector update(Lector lector){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(lector);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return lector;
	}

	@Override
	public void delete(Lector lector){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(lector);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
		session.close();
		}
	}

	@Override
	public List<Lector> getAll(){
		Session session = SessionFactoryService.get().openSession();
		List<Lector> fichas = new ArrayList<>();
		try {
			session.beginTransaction();
			fichas.addAll(session.createQuery("select t from FichaLibro t")
					.getResultList());
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return fichas;
	}

	@Override
	public Lector login(String email, String password){
		Session session = SessionFactoryService.get().openSession();
		Lector lector = null;
		try {
			session.beginTransaction();
			lector = (Lector) session.createQuery ("select t from Lector t where t.email= :email and t.password= :password")
					.setParameter("email", email)
					.setParameter("password", password)
					.uniqueResult();
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return lector;
	}

}

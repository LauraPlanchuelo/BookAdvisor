
package com.bookadvisor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.bookadvisor.dao.model.FichaLibro;

public class FichaLibroDAOImplementation implements FichaLibroDAO {
	
	public static FichaLibroDAOImplementation instance;
	
	private FichaLibroDAOImplementation() { }
	public static FichaLibroDAOImplementation getInstance() {
		if ( null == instance )
			instance = new FichaLibroDAOImplementation();
		return instance;
	}

	@Override
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
	}
		
	@Override
	public FichaLibro read(String titulo){
		Session session = SessionFactoryService.get().openSession();
		FichaLibro libro = null;
		try {
			libro = session.get(FichaLibro.class, titulo);
		} catch (Exception e) {
		} finally {
			session.close();
		}		
		return libro;
	}
		
	@Override
	public FichaLibro update(FichaLibro ficha){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(ficha);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return ficha;
	}

	@Override
	public void delete(FichaLibro ficha){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(ficha);
			session.getTransaction().commit();
		} catch (Exception e) {
		// TODO: handle exception
		} finally {
			session.close();
		}
	}
		
	@Override
	public List<FichaLibro> getAll(){
		Session session = SessionFactoryService.get().openSession();
		List<FichaLibro> fichas = new ArrayList<>();
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

}


package com.bookadvisor.dao;

import java.util.List;

import com.bookadvisor.dao.model.FichaLibro;

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
		
	public FichaLibro read(String titulo){
		Session session = SessionFactoryService.get().openSession();
		FichaLibro libro = null;
		try {
			libro = session.get(libro.class, titulo);
		} catch (Exception e) {
		} finally {
			session.close();
		}		
		return libro;
	}
		
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
	}
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
	public List<FichaLibro> getAll(){
		Session session = SessionFactoryService.get().openSession();
		List<FichaLibro> fichas = new ArrayList<>();
		try {
			session.beginTransaction();
			fichas.addAll(session.createQuery("select t from FichaLibro
							  t”).getResultList());
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return fichas;
	}

}

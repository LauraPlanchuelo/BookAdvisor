
package com.bookadvisor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.bookadvisor.dao.model.Noticia;

public class NoticiaDAOImplementation implements NoticiaDAO {
	
	public static NoticiaDAOImplementation instance;
	
	private NoticiaDAOImplementation() { 
	
	}
	
	public static NoticiaDAOImplementation getInstance() {
		if ( null == instance )
			instance = new NoticiaDAOImplementation ();
		return instance;
	}

	@Override
	public void create(Noticia noticia) {
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(noticia);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
	}

	@Override
	public Noticia read(String titulo){
		Session session = SessionFactoryService.get().openSession();
		Noticia noticia = null;
		try {
			noticia = session.get(Noticia.class, titulo);
		} catch (Exception e) {
		} finally {
				session.close();
		}		
		return noticia;
	}
	
	@Override
	public Noticia update(Noticia noticia){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(noticia);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return noticia;
	}
	
	@Override
	public void delete(Noticia noticia){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(noticia);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
	}
	@Override
	public List<Noticia> getAll(){
		Session session = SessionFactoryService.get().openSession();
		List<Noticia> noticias = new ArrayList<>();
		try {
			session.beginTransaction();
			noticias.addAll(session.createQuery("select t from Noticia t")
					.getResultList() );
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return noticias;
	}

	

}

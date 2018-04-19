package com.bookadvisor.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.bookadvisor.dao.model.Biblioteca;

public class BibliotecaDAOImplementation implements BibliotecaDAO {

	public static BibliotecaDAOImplementation instance;
	private BibliotecaDAOImplementation() { }
	public static BibliotecaDAOImplementation getInstance() {
		if ( null == instance )
			instance = new BibliotecaDAOImplementation ();
		return instance;
	}
	
	@Override
	public void create(Biblioteca biblioteca){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.save(biblioteca);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
				session.close();
		}
	}
		
	@Override
	public Biblioteca read(String titulo){
		Session session = SessionFactoryService.get().openSession();
		Biblioteca biblioteca = null;
		try {
			biblioteca = session.get(Biblioteca.class, titulo);
		} catch (Exception e) {
		} finally {
			session.close();
		}		
		return biblioteca;
	}
		
	@Override
	public Biblioteca update(Biblioteca biblioteca){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.saveOrUpdate(biblioteca);
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return biblioteca;
	}
		
	@Override
	public void delete(Biblioteca biblioteca){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(biblioteca);
			session.getTransaction().commit();
		} catch (Exception e) {
		// TODO: handle exception
		} finally {
			session.close();
		}
		
	}
		
	@Override
	public List<Biblioteca> getAll(){
		Session session = SessionFactoryService.get().openSession();
		List<Biblioteca> bibliotecas = new ArrayList<>();
		try {
			session.beginTransaction();
			bibliotecas.addAll(session.createQuery("select t from Biblioteca t")
					.getResultList() );
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return bibliotecas;
	}
	
}

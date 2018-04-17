package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.Biblioteca;

public class BibliotecaDAOimplementation implements BibliotecaDAO {
	public static BibliotecaDAOimplementation instance;
	private BibliotecaDAOimplementation() { }
	public static BibliotecaDAOimplementation getInstance() {
		if ( null == instance )
			instance = new BibliotecaDAOimplementacion();
		return instance;
	}
	
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
		
	public Biblioteca read(String titulo){
		Session session = SessionFactoryService.get().openSession();
		Biblioteca biblioteca = null;
		try {
			biblioteca = session.get(biblioteca.class, titulo);
		} catch (Exception e) {
		} finally {
			session.close();
		}		
		return biblioteca;
	}
		
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
		
	public List<Biblioteca> getAll(){
		Session session = SessionFactoryService.get().openSession();
		List<Biblioteca> bibliotecas = new ArrayList<>();
		try {
			session.beginTransaction();
			bibliotecas.addAll(session.createQuery("select t from Biblioteca t”).getResultList() );
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return bibliotecas;
	}
	
	public Biblioteca login(String email, String password){
		Session session = SessionFactoryService.get().openSession();
		Biblioteca biblioteca = null;
		try {
			session.beginTransaction();
			biblioteca = (Biblioteca) session.createQuery (
			“select t from Biblioteca t where t.email= :email and t.password= :password”).
				
			.setParameter(“email”, email).
			.setParameter(“password”, password).uniqueResult();
				session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return biblioteca;
	}

}

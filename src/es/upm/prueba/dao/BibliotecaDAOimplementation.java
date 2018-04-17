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
	
	public void create(Biblioteca biblioteca);
	public Biblioteca read(String titulo);
	public Biblioteca update(Biblioteca biblioteca);
	public void delete(Biblioteca biblioteca);
	public List<Biblioteca> getAll();
	
	public Biblioteca login(String email, String password){
		Session session = SessionFactoryService.get().openSession();
		Biblioteca biblioteca = null;
		try {
			session.beginTransaction();
			biblioteca = (Biblioteca) session.createQuery (
			“select t from TFG t where t.email= :email and t.password= :password”).
				
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

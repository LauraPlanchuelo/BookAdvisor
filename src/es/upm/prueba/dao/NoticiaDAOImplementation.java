
package es.upm.prueba.dao;

import java.util.List;

import es.upm.prueba.model.Noticia;

@override
public interface NoticiaDAOImplementation implements NoticiaDAO {
	
	public static NoticiaDAOimplementation instance;
	
	private NoticiaDAOimplementation() { 
	
	}
	
	public static NoticiaDAOimplementation getInstance() {
		if ( null == instance )
			instance = new NoticiaDAOimplementacion();
		return instance;
	}

		public FichaLibro read(String titulo);
	public FichaLibro update(FichaLibro ficha);
	public void delete(FichaLibro ficha);
	public List<FichaLibro> getAll();
	
	@override
	public Noticia read(String titulo){
		Session session = SessionFactoryService.get().openSession();
		Noticia noticia = null;
		try {
			libro = session.get(noticia.class, titulo);
		} catch (Exception e) {
		} finally {
				session.close();
		}		
		return libro;
	}
	
	@override
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
	}
	
	@override
	public void delete(Noticia noticia){
		Session session = SessionFactoryService.get().openSession();
		try {
			session.beginTransaction();
			session.delete(noticia);
			session.getTransaction().commit();
		} catch (Exception e) {
		// TODO: handle exception
		} finally {
		session.close();
	}
}
	@override
	public List<Noticia> getAll(){
		Session session = SessionFactoryService.get().openSession();
		List<Noticia> noticia = new ArrayList<>();
		try {
			session.beginTransaction();
			fichas.addAll(session.createQuery("select t from Noticia t”).getResultList() );
			session.getTransaction().commit();
		} catch (Exception e) {
		} finally {
			session.close();
		}
		return fichas;
	}
	

}

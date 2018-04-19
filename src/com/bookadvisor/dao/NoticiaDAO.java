package com.bookadvisor.dao;

import java.util.List;

import com.bookadvisor.dao.model.Noticia;

public interface NoticiaDAO {

	public void create(Noticia noticia);
	public Noticia read(String titulo);
	public Noticia update(Noticia noticia);
	public void delete(Noticia noticia);
	public List<Noticia> getAll();

}

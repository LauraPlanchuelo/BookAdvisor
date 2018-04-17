package es.upm.prueba.model;

import java.io.Serializable;

public class Noticia implements Serializable {
	
	private String titulo;
	private String autor;
	private String cuerpo;
	
	public String getTitulo() {
		return titulo;
	}
	
	public Noticia setTitulo(String titulo) {
		this.titulo = titulo;
		return this;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public Noticia setAutor(String autor) {
		this.autor = autor;
		return this;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public Noticia setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
		return this;
	}

}

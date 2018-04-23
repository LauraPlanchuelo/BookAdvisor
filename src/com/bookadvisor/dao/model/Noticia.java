package com.bookadvisor.dao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Noticia implements Serializable {
	
	@Id
	private String titulo;

	@ManyToOne
	private Libreria autor;
	private String cuerpo;
	
	public String getTitulo() {
		return titulo;
	}
	
	public Noticia setTitulo(String titulo) {
		this.titulo = titulo;
		return this;
	}
	
	public Libreria getAutor() {
		return autor;
	}
	
	public Noticia setAutor(Libreria autor) {
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

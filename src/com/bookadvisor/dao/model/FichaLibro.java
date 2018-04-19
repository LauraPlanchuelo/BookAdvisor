package com.bookadvisor.dao.model;

import java.awt.Image;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class FichaLibro implements Serializable {
	
	private String titulo;
	private String autor;
	private String editorial;
	private String formato;
	private String ISBN;
	
	private List<String> resena;
	private List<String> bibliotecas;
	private String categoria;
	private Date date;
	private Image imagen;

	public String getTitulo() {
		return titulo;
	}

	public FichaLibro setTitulo(String titulo) {
		this.titulo = titulo;
		return this;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public FichaLibro setAutor(String autor) {
		this.autor = autor;
		return this;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public FichaLibro setEditorial(String editorial) {
		this.editorial = editorial;
		return this;
	}
	
	public String getFormato() {
		return formato;
	}
	
	public FichaLibro setFormato(String formato) {
		this.formato = formato;
		return this;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public FichaLibro setISBN(String iSBN) {
		ISBN = iSBN;
		return this;
	}
	
	public List<String> getResena() {
		return resena;
	}
	
	public FichaLibro setResena(List<String> resena) {
		this.resena = resena;
		return this;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public FichaLibro setCategoria(String categoria) {
		this.categoria = categoria;
		return this;
	}
	
	public Date getDate() {
		return date;
	}
	
	public FichaLibro setDate(Date date) {
		this.date = date;
		return this;
	}
	
	public Image getImagen() {
		return imagen;
	}
	
	public FichaLibro setImagen(Image imagen) {
		this.imagen = imagen;
		return this;
	}

	public List<String> getBibliotecas() {
		return bibliotecas;
	}

	public FichaLibro setBibliotecas(List<String> bibliotecas) {
		this.bibliotecas = bibliotecas;
		return this;
	}
	
}

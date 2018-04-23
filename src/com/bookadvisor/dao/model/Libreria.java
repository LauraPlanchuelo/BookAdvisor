package com.bookadvisor.dao.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Libreria implements Serializable {
	
	@Id
	private String email;
	private String nombre;
	private String web;
	private String password;
	@OneToMany(mappedBy = "autor", fetch = FetchType.EAGER)
	private List<Noticia> promociones;
	
	public String getNombre() {
		return nombre;
	}
	
	public Libreria setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public String getWeb() {
		return web;
	}
	
	public Libreria setWeb(String web) {
		this.web = web;
		return this;
	}
	
	public String getEmail() {
		return email;
	}
	
	public Libreria setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Libreria setPassword(String password) {
		this.password = password;
		return this;
	}
	
	public List<Noticia> getPromociones() {
		return promociones;
	}
	
	public Libreria setPromociones(List<Noticia> promociones) {
		this.promociones = promociones;
		return this;
	}
	
}

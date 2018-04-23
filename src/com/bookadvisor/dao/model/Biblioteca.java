package com.bookadvisor.dao.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Biblioteca implements Serializable {
	
	@Id
	private String nombre;
	private String web;
	private String localizacion;
	
	public String getNombre() {
		return nombre;
	}

	public Biblioteca setNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public String getWeb() {
		return web;
	}
	
	public Biblioteca setWeb(String web) {
		this.web = web;
		return this;
	}
	
	public String getLocalizacion() {
		return localizacion;
	}
	
	public Biblioteca setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
		return this;
	}

}

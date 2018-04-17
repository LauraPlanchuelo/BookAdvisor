package es.upm.prueba.model;

import java.io.Serializable;

public class Biblioteca implements Serializable {
	
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

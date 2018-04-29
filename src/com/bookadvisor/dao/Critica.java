package com.bookadvisor.dao.model;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Critica implements Serializable {
	
	@Id
	private String autor;
	private String texto;
	
	
	@ElementCollection(targetClass=String.class)
	private List<String> criticas_list; 

	
	public Critica() {
		this.criticas_list = new ArrayList<>();
	}

	public String getAutor() {
		return autor;
	}

	public String getTexto() {
		return texto;
	}
	
	
	public List<String> getCriticas() {
		return criticas_list;
	}

}
package com.marson.cursojavamc.dto;

import java.io.Serializable;

import com.marson.cursojavamc.domain.Categoria;

public class CategoriaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id ;
	private String name ;
	
	public CategoriaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public CategoriaDTO(Categoria obj) {
		// TODO Auto-generated constructor stub
		id = obj.getId();
		name = obj.getName();
	}

	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

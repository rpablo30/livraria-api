package com.rpablo30.bookstore.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;


@Data
public class Categoria {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id ; 
	private String nome ; 
	private String descricao;
	

	private List<Livro> Livros = new ArrayList<>();


	public Categoria() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Categoria(Integer id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	
	
	
	

}

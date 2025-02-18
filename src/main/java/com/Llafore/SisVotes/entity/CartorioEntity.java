package com.Llafore.SisVotes.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cartorios")
public class CartorioEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nome;
	private String uf;
	
	public CartorioEntity() {
	}
	
	public CartorioEntity(int id, String nome, String uf) {
		super();
		this.id = id;
		this.nome = nome;
		this.uf = uf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
}

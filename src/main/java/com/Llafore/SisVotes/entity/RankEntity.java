package com.Llafore.SisVotes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="rank")
public class RankEntity {
	private int id;
	private CartorioEntity cartorio;
	private ColaboradorEntity colaborador;
	private int posicao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CartorioEntity getCartorio() {
		return cartorio;
	}
	public void setCartorio(CartorioEntity cartorio) {
		this.cartorio = cartorio;
	}
	public ColaboradorEntity getColaborador() {
		return colaborador;
	}
	public void setColaborador(ColaboradorEntity colaborador) {
		this.colaborador = colaborador;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	
}

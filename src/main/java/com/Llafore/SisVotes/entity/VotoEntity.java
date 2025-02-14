package com.Llafore.SisVotes.entity;

import jakarta.persistence.*;

@Entity
@Table(name="votos")
public class VotoEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name = "id_cartorio", nullable = false)
	private CartorioEntity cartorio;
	@ManyToOne
	@JoinColumn(name = "id_colaborador", nullable = false)
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

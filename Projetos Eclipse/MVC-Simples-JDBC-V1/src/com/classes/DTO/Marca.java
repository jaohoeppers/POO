package com.classes.DTO;

public class Marca {
	private int codigo;
	private String descricao;
	private int numero;
	public Marca() {

	}
	public Marca(int codigo) {
		setCodigo(codigo);
	}
	public Marca(String descricao, int numero) {
		setDescricao(descricao);
		setNumero(numero);
	}
	public Marca(int codigo, String descricao) {
		setCodigo(codigo);
		setDescricao(descricao);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Marca [codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}
}
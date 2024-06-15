package br.com.lkf.AppProdutos.model;

import java.util.Objects;

public class Estoque {
	private long id;
	private Integer quantidade;
	
	public Estoque() {}

	public Estoque(long id, Integer quantidade) {
		this.id = id;
		this.quantidade = quantidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estoque other = (Estoque) obj;
		return id == other.id;
	}
	
	@Override
	public String toString() {
		return "[id = " + this.id + ", " +
			   "quantidade = " + this.quantidade + "]";
	}
}

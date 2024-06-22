package br.com.lkf.AppProdutos.dto;

public record ProdutoSimplesDTO(
		Long id, 
		String codigoBarras, 
		Double preco,
		Double precoVarejo,
		Integer quantidade) { }
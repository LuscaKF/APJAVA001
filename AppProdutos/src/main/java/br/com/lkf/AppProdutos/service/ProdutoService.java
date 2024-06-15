package br.com.lkf.AppProdutos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lkf.AppProdutos.model.Produto;
import br.com.lkf.AppProdutos.repository.ProdutoRepository;

@Service
public class ProdutoService {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto save(Produto produto) {
		if(produto.getNome() == null) {
			System.out.println("Nome do produto vazio.");
			return null;
		}
		if(produto.getCodigoBarras() == null) {
			System.out.println("Código de barra do produto vazio.");
			return null;
		}
		
		// Gravar
		return produtoRepository.save(produto);
	}
}

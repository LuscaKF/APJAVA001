package br.com.lkf.AppProdutos.service;

import java.util.List;
import java.util.Optional;

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
		try {
			return produtoRepository.save(produto); // Para o banco de dados
		} catch (Exception e) {
			System.out.println("ERR: Erro ao inserir produto " + produto.toString() + ":" + e.getMessage());
			return null;
		}
		
	}
	
	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}
	
	public Optional<Produto> findById(Long id) {
		return produtoRepository.findById(id);
	}
	
	public Produto update(Produto produto) {
		// Pesquisar se o produto existe
		Optional<Produto> findProduto = produtoRepository.findById(produto.getId());
		
		// Se o produto existir, atualizar
		if(findProduto.isPresent()) {
			// Criar um novo objeto do produto e lançar os dados do objeto de parâmetro
			Produto updProduto = findProduto.get();
			updProduto.setCodigoBarras(produto.getCodigoBarras());
			updProduto.setNome(produto.getNome());
			updProduto.setPreco(produto.getPreco());
			// Retornar o objeto gravado
			return produtoRepository.save(updProduto); // "UPDATE"
		}
		// Retornar o objeto gravado
		return produtoRepository.save(produto); // "INSERT"
	}
	
	public void delete(Long id) {
		produtoRepository.deleteById(id);
	}
}

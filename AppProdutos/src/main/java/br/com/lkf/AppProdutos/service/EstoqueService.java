package br.com.lkf.AppProdutos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lkf.AppProdutos.model.Estoque;
import br.com.lkf.AppProdutos.model.Produto;
import br.com.lkf.AppProdutos.repository.EstoqueRepository;
import br.com.lkf.AppProdutos.repository.ProdutoRepository;
import br.com.lkf.AppProdutos.service.interfaces.EstoqueServiceInterface;

@Service
public class EstoqueService implements EstoqueServiceInterface {
	@Autowired
	private EstoqueRepository estoqueRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public Estoque save(Estoque estoque) {
		// Verificar se o produto existe, caso não, avisar
		if(estoque.getProduto().getId() != null) {
			// Buscar no banco de dados
			Optional<Produto> findProduto = produtoRepository.findById(estoque.getProduto().getId());
			if(!findProduto.isEmpty()) {
				estoque.setProduto(findProduto.get());
				return estoqueRepository.save(estoque);
			} else {
				System.out.println("Produto não encontrado id: " + estoque.getProduto().getId());
				return null;
			}
		} else {
			System.out.println("Produto não encontrado!");
			return null;
		}
	}

	@Override
	public Optional<Estoque> findById(Long id) {
		return estoqueRepository.findById(id);
	}

	@Override
	public List<Estoque> findAll() {
		return estoqueRepository.findAll();
	}

	@Override
	public Estoque update(Estoque estoque) {
		// Pesquisar se o estoque existe:
		Optional<Estoque> findEstoque = estoqueRepository.findById(estoque.getId());
		
		// Se o estoque existir, atualizar (Persistir)
		if(findEstoque.isPresent()) {
			// Criar um novo objeto de estoque e lançar os dados do objeto de parâmetro neste novo obj e gravar
			Estoque updEstoque = findEstoque.get();
			updEstoque.setQuantidade(estoque.getQuantidade());
			// Retornar o objeto gravado
			return estoqueRepository.save(updEstoque); // UPDATE
		} else {
			// INSERT
			return save(estoque);
		}
	}

	@Override
	public void delete(Long id) {
		estoqueRepository.deleteById(id);
	}
}

package br.com.lkf.AppProdutos.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lkf.AppProdutos.model.Produto;
import br.com.lkf.AppProdutos.service.ProdutoService;

@RestController
@RequestMapping("/api/produtos")  // http://localhost:8081/api/produtos
public class ProdutoResource {
	@Autowired
	ProdutoService produtoService;
	
	/*
	@GetMapping("produto") // http://localhost:8081/api/produtos/produto
	public ResponseEntity<Produto> getProduto() {
		Produto produto = new Produto();
		produto.setId(1L);
		produto.setCodigoBarras("123456");
		produto.setNome("Produto 1");
		produto.setPreco(55.0);
		return ResponseEntity.ok(produto);
	}
	
	@GetMapping("salvar") // http://localhost:8081/api/produtos/salvar
	public ResponseEntity<Produto> save2() {
		Produto produto = new Produto();
		produto.setCodigoBarras("123456");
		produto.setNome("Produto 1");
		produto.setPreco(55.0);
		
		// Está indo até a classe de serviço
		Produto produtoResposta = produtoService.save(produto);
		if(produtoResposta == null) {
			ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(produtoResposta);
	}
	
	*/
	
	@GetMapping // http://localhost:8081/api/produtos
	public ResponseEntity<List<Produto>> findAllProdutos() {
		List<Produto> produtos = produtoService.findAll();
		if(produtos == null) {
			return ResponseEntity.notFound().build();
		}
		if(produtos.size() == 0) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(produtos);
	}
	
	@GetMapping("/{id}") // http://localhost:8081/api/produtos/2
	public ResponseEntity<Optional<Produto>> findById(@PathVariable Long id) {
		Optional<Produto> produto = produtoService.findById(id);
		if(produto.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(produto);
	}
	
	@PostMapping // http://localhost:8081/api/produtos
	public ResponseEntity<Produto> save(@RequestBody Produto produto) {
		Produto newProduto = produtoService.save(produto);
		if(newProduto == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(newProduto);
		}
	}
	
	@PutMapping // http://localhost:8081/api/produtos
	public ResponseEntity<Produto> update(@RequestBody Produto produto) {
		Produto updProduto = produtoService.update(produto);
		if(updProduto == null) 
			return ResponseEntity.notFound().build(); 
		return ResponseEntity.ok(updProduto);
		
	}
	
	@DeleteMapping("/{id}") // http://localhost:8081/api/produtos/2
	public ResponseEntity<?> delete(@PathVariable Long id) {
		produtoService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Status code 204
	}
}

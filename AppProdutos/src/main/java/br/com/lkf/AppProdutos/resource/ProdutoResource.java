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
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/produtos")  // http://localhost:8081/api/produtos
public class ProdutoResource {
	@Autowired
	ProdutoService produtoService;
	
	@Operation(summary = "Busca todos os registros por ID de produtos")
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
	
	@Operation(summary = "Busca um registro por ID de produtos")
	@GetMapping("/{id}") // http://localhost:8081/api/produtos/2
	public ResponseEntity<Optional<Produto>> findById(@PathVariable Long id) {
		Optional<Produto> produto = produtoService.findById(id);
		if(produto.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(produto);
	}
	
	@Operation(summary = "Grava os registros de produtos")
	@PostMapping // http://localhost:8081/api/produtos
	public ResponseEntity<Produto> save(@RequestBody Produto produto) {
		Produto newProduto = produtoService.save(produto);
		if(newProduto == null) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(newProduto);
		}
	}
	
	@Operation(summary = "Atualiza o registro de produto. Validação por ID")
	@PutMapping // http://localhost:8081/api/produtos
	public ResponseEntity<Produto> update(@RequestBody Produto produto) {
		Produto updProduto = produtoService.update(produto);
		if(updProduto == null) 
			return ResponseEntity.notFound().build(); 
		return ResponseEntity.ok(updProduto);
		
	}
	
	@Operation(summary = "Exclui o registro de produto por ID")
	@DeleteMapping("/{id}") // http://localhost:8081/api/produtos/2
	public ResponseEntity<?> delete(@PathVariable Long id) {
		produtoService.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Status code 204
	}
}

package br.com.lkf.AppProdutos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.lkf.AppProdutos.model.Produto;

@SpringBootApplication
public class AppProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppProdutosApplication.class, args);
		
		Produto produto = new Produto();
		produto.setId(1L);
		produto.setCodigoBarras("123234234");
		produto.setNome("Nome do produto");
		produto.setPreco(1.5);
		
		System.out.println(produto.toString());
	}

}

package br.com.lkf;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.lkf.exception.LimiteCreditoExcedidoException;
import br.com.lkf.model.Aluno;
import br.com.lkf.model.ContaBancaria;
import br.com.lkf.model.Disciplina;
import br.com.lkf.model.Professor;
import br.com.lkf.model.Pessoa;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.println("------------");
		
		
		
		
		System.out.println(":: Operadores lógicos! ::");
		
		
		
		// Validação de operadores lógicos
		boolean condicao = true;
		if(condicao == true) {
			System.out.println("Minha condição é verdadeira!");
		} else {
			System.out.println("Minha condição é falsa!");
		}
		
		int idade = 11;
		if (idade < 10) {
			System.out.println("Filme infantil! ("+ idade + ")");
		} else if(idade >= 10 && idade < 18) {
			System.out.println("Filme juvenil! ("+ idade + ")");
		} else {
			System.out.println("Filme adulto! ("+ idade + ")");
		}
		
		
		
		
		System.out.println(":: Switch ::");
		
		
		
		// Switch
		idade = 2;
		switch(idade) {
			case 2:
				System.out.println("Idade igual a 2");
				break;
			case 3:
				System.out.println("Idade igual a 3");
				break;
			case 4:
				System.out.println("Idade igual a 4");
				break;
			case 5:
				System.out.println("Idade igual a 5");
				break;
			case 10:
				System.out.println("Idade igual a 10");
				break;
			case 11:
				System.out.println("Idade igual a 11");
				break;
			case 20:
				System.out.println("Idade igual a 20");
				break;
			default:
				System.out.println("Outra idade!");
				break;
		}
		
		
		
		
		System.out.println(":: Looping ::");
		
		
		
		// Trabalhando com loopings
		// Criar uma contagem de 0 a 20
		int max = 21;
		for(int numero = 0; numero < max; numero++) {
			// System.out.print(numero);
			
			if(numero % 2 == 0) {
				// Se for número par exibir um * sobre o número.
				System.out.print("*" + numero + "*");
			} else {
				// Caso não seja número par exibir normalmente.
				System.out.print(numero);
			}
			
			if(numero < (max - 1)) {
				System.out.print(", ");
			}
		}
		
		// While
		int i = 0;
		while(i <= 10) {
			System.out.println("Escrevendo i: " + i);
			
			switch(i) {
				case 1:
					System.out.println(" Achei o 1!");
					break;
				default:
					System.out.print("-----");
			}
			
			i++;
		}
		
		
		
		
		System.out.println(":: Programção Orientada a Objetos ::");
		
		
		
		// Objetos
		
		/*
		Carro carro1 = new Carro(); // Instanciando uma classe
		carro1.cor = "Branca";
		carro1.marca = "Chevrolet";
		carro1.modelo = "Onix";
		carro1.andar();

		Carro carro2 = new Carro(); // Instanciando uma classe
		carro2.cor = "Azul";
		carro2.marca = "BYD";
		carro2.modelo = "Delphin";
		carro2.parar();
		*/
		
		Carro carro3 = new Carro("Branca", "Chevrolet", "Onix");
		carro3.andar();
		
		Carro carro5 = new Carro();
		carro5.setCor("Verde");
		carro5.setMarca("VW");
		carro5.setModelo("Fusca");
		carro5.setCambio("Manual");
		System.out.println("Carro 5: " + carro5.toString());
		carro5.andar();
		
		
		
		
		System.out.println(":: Programação Orientada a Objetos - Herença ::");
		
		
		
		// Herença
		Aluno aluno1 = new Aluno("123456", 2024, "Lucas", "11910447030", "lucasfernandesf18@gmail.com");
		System.out.println("Aluno1: " + aluno1.toString());
		
		Professor professor1 = new Professor("POO", "Mestre", 1, "Ana Paula", "11988039874", "akirowjuca@gmail.com");
		System.out.println("Professor1: " + professor1.toString());
		
		
		
		System.out.println(":: Programação Orientada a Objetos - Herença/Polimorfismo ::");
		
		
		
		// Polimorfismo
		Pessoa pessoa1 = new Aluno("3333", 2024, "Nome pesso 1", "Telefone", "pessoa1@gmail.com"); // Criar uma Pessoa implementando Aluno
		
		Pessoa pessoa2 = new Professor("Prog Web", "Doutor", 2, "Pessoa 2", "12345678", "prof@gmail.com"); // Criar uma Pessoa implementando Professor
		
		System.out.println("Pessoa1: " + pessoa1.toString());
		System.out.println("Pessoa2: " + pessoa2.toString());
		
		
		
		System.out.println(":: Tratamento de erros ::");
		
		
		
		// Exceptions
		 try {
			System.out.println("Vou fazer a conta...");
			int valor = 10 / 1;
			System.out.println("O resultado é igual a: " + valor);
			
			int[] numeros = {0, 1, 2};
			for(int y = 0; y<4; y++)
				System.out.println(numeros[y]);
			
		} catch (ArithmeticException e) {
			System.out.println(" - Error: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" - Error: " + e.getMessage());
		}
		 
		Funcao funcao = new Funcao();
		try {
			funcao.lerArquivo("Principal.class");
		} catch (FileNotFoundException e) {
			// System.out.println(" - Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		// Exceptions personalizadas
		ContaBancaria contaBancaria = new ContaBancaria(1500);
		try {
			contaBancaria.fazerPix(2000);
		} catch (LimiteCreditoExcedidoException e) {
			System.out.println(" - Error: " + e.getMessage());
			// e.printStackTrace();
		}
		
		
		
		
		System.out.println(":: Coleções - List ::");
		
		
		
		// Coleções - List
		List<String> nomes = new ArrayList<String>();
		nomes.add("Lucas");
		nomes.add("Ana Paula");
		nomes.add("Marcella");
		nomes.add("Pedro");
		
		nomes.remove(3);
		Collections.sort(nomes);
		
		List<String> nomesFiltrados = nomes.stream()
				.filter(nome2 -> nome2.startsWith("A"))
				.collect(Collectors.toList());
		
		for(String nome : nomesFiltrados) {
			System.out.println("Nomes com filtro: " + nome);
		}
		
		for(String nome : nomes) {
			System.out.println("Nomes sem filtro: " + nome);
		}
		
		List<Carro> carros = new ArrayList<Carro>();
		carros.add(carro3);
		carros.add(carro5);
		
		for(Carro carro : carros) {
			System.out.println(carro.toString());
		}
		
		
		
		
		System.out.println(":: Coleções - Set ::");
		
		
		
		// Coleções - Set
		Set<String> cores = new HashSet<String>();
		cores.add("Azul");
		cores.add("Vermelho");
		cores.add("Verde");
		cores.add("Amarelo");
		
		for(String cor : cores) {
			System.out.println(cor);
		}
		
		
		
		
		System.out.println(":: Coleções - Map ::");
		
		
		
		// Coleções - Map
		Map<String, String> paises = new HashMap<String, String>();
		paises.put("Brasil", "Brasília");
		paises.put("França", "Paris");
		paises.put("Portugal", "Lisboa");
		paises.put("Espanha", "Madrid");
		
		for(Map.Entry<String, String> entrada : paises.entrySet()) {
			System.out.println(entrada.getKey() + " - " + entrada.getValue());
		}
		
		System.out.println("Capital de Portugal: " + paises.get("Portugal"));
		
		Map<Integer, Carro> estacionamento = new HashMap<Integer, Carro>();
		estacionamento.put(0, carro3);
		estacionamento.put(1, carro5);
		
		System.out.println("Carro número 3: " + estacionamento.get(0));
		System.out.println("Carro número 5: " + estacionamento.get(1));
		
		
		
		
		System.out.println(":: Builder ::");
		
		
		
		// Builder
		Disciplina disciplina1 = new Disciplina("POO", "2p", 200);
		System.out.println("Disciplina1: " + disciplina1);
		
		Disciplina disciplina2 = Disciplina.builder()
				.setNome("Banco de dados")
				.setPeriodo("3p")
				.setCargaHoraria(300)
				.build();
		System.out.println("Disciplina2: " + disciplina2);
	}
}

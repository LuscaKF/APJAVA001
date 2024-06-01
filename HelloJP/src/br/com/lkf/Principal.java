package br.com.lkf;

import br.com.lkf.model.Aluno;
import br.com.lkf.model.Professor;

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
		
		Carro carro4 = new Carro("Azul", "BYD", "Delphin", false);
		System.out.println("Carro 4: " + carro4.toString());
		carro4.parar();
		
		Carro carro5 = new Carro();
		carro5.setCor("Verde");
		carro5.setMarca("VW");
		carro5.setModelo("Fusca");
		carro5.setCambio("Manual");
		System.out.println("Carro 5: " + carro5.toString());
		carro5.andar();
		
		
		System.out.println(":: Programação Orientada a Objetos - Herença ::");
		
		
		Aluno aluno1 = new Aluno("123456", 2024, "Lucas", "11910447030", "lucasfernandesf18@gmail.com");
		System.out.println("Aluno1: " + aluno1.toString());
		
		Professor professor1 = new Professor("POO", "Mestre", 1, "Ana Paula", "11988039874", "akirowjuca@gmail.com");
		System.out.println("Professor1: " + professor1.toString());
	}
	

}

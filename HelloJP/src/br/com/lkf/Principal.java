package br.com.lkf;

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
		Carro carro1 = new Carro();
		carro1.cor = "Branca";
		carro1.marca = "Chevrolet";
		carro1.modelo = "Onix";
		carro1.andar();

		Carro carro2 = new Carro();
		carro2.cor = "Azul";
		carro2.marca = "BYD";
		carro2.modelo = "Delphin";
		carro2.parar();
	}

}

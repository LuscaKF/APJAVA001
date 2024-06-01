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

	}

}

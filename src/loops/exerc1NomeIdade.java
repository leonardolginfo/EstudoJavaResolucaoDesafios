package loops;

import java.util.Scanner;

/*
 * Ler dois valores, o primeiro é o nome 
 * e o segundo é a idade.
 * O programa deve para ao inserir o número 0 no nome
 * 
 * */
public class exerc1NomeIdade {

	public static void main(String[] args) {
	
		String nome = null;
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Digite o nome da pessoa: ");
			nome = ler.next();
			
			if(nome.equals("0")) break;
			
			System.out.println("Digite a idade da pessoa: ");
			idade = ler.nextInt();
			
			System.out.println("O nome da pessoa é " + nome + " e a sua idade é " + idade);
			
			
		}
		ler.close();
		
		System.out.println("Entrada encerrada.");
		
		}
}

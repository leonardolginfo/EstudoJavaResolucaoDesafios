/*
 * Ler cinco n�meros, 
 * informe o maior
 * e a m�dia 
 * */

package loops;

import java.util.Scanner;



public class lerCincoNumerosMaiorComMedia {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
	/*	double num1, num2, num3, num4, num5;
		double media;*/
		
		int numero;
		int maior = 0;
		int soma = 0;
		
		int cont = 0;
		
		do {
			
			System.out.println("Digite um n�mero:");
			numero = ler.nextInt();
			
			if(numero > maior) maior = numero;
			soma += numero; 
			
			cont++;
			
		} while (cont < 5);
		
		ler.close();
		
		
		System.out.println("O maior n�mero digitado �: " + maior);
		System.out.println("A m�dia dos n�meros informados �: " + (soma/cont));
	}

}

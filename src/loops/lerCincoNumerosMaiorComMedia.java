/*
 * Ler cinco números, 
 * informe o maior
 * e a média 
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
			
			System.out.println("Digite um número:");
			numero = ler.nextInt();
			
			if(numero > maior) maior = numero;
			soma += numero; 
			
			cont++;
			
		} while (cont < 5);
		
		ler.close();
		
		
		System.out.println("O maior número digitado é: " + maior);
		System.out.println("A média dos números informados é: " + (soma/cont));
	}

}

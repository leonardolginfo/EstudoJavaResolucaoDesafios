/*
 * Peça um número e verifique se o número
 * está entre 1 e 10, caso não esteja peça para 
 * o usuário digitar até que entre com um número dentro da faixa
 * 
 * VERSÃO 2 - MAIS CURTA
 * 
 * */
package loops;

import java.util.Scanner;

public class exer2ValorCorreto2Versao2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int numero;
		System.out.println("Digite um número entre 1 e 10 : ");
		numero = ler.nextInt();
		
		while(numero < 1 | numero > 10) {	
			System.out.println("Número inválido, tente novamente.");
			numero = ler.nextInt();
			}
		System.out.println("Nota inserida, obrigado! ");
		ler.close();
			
		}
		
	}


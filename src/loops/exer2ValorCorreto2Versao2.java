/*
 * Pe�a um n�mero e verifique se o n�mero
 * est� entre 1 e 10, caso n�o esteja pe�a para 
 * o usu�rio digitar at� que entre com um n�mero dentro da faixa
 * 
 * VERS�O 2 - MAIS CURTA
 * 
 * */
package loops;

import java.util.Scanner;

public class exer2ValorCorreto2Versao2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int numero;
		System.out.println("Digite um n�mero entre 1 e 10 : ");
		numero = ler.nextInt();
		
		while(numero < 1 | numero > 10) {	
			System.out.println("N�mero inv�lido, tente novamente.");
			numero = ler.nextInt();
			}
		System.out.println("Nota inserida, obrigado! ");
		ler.close();
			
		}
		
	}


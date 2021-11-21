/*
 * Pe�a um n�mero e verifique se o n�mero
 * est� entre 1 e 10, caso n�o esteja pe�a para 
 * o usu�rio digitar at� que entre com um n�mero dentro da faixa
 * Ver git teste
 * */
package loops;

import java.util.Scanner;

public class exer2ValorCorreto {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int numero;
		
		boolean faixaCorreta = false;

		
		do {
			
			System.out.println("Digite um n�mero entre 1 e 10 : ");
			numero = ler.nextInt();
			
			if((numero >= 1) && (numero <= 10))	faixaCorreta = true;
			
			if(faixaCorreta) {
				System.out.println("Obrigado!");
				break;
				
			} else {
				System.out.println("N�mero inv�lido, tente novamente.");
			}
			
		} while (!faixaCorreta);
		
		ler.close();
	}
}

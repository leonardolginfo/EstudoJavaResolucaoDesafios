/*
 * Peça um número e verifique se o número
 * está entre 1 e 10, caso não esteja peça para 
 * o usuário digitar até que entre com um número dentro da faixa
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
			
			System.out.println("Digite um número entre 1 e 10 : ");
			numero = ler.nextInt();
			
			if((numero >= 1) && (numero <= 10))	faixaCorreta = true;
			
			if(faixaCorreta) {
				System.out.println("Obrigado!");
				break;
				
			} else {
				System.out.println("Número inválido, tente novamente.");
			}
			
		} while (!faixaCorreta);
		
		ler.close();
	}
}

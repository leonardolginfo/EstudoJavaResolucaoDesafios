/*
 * Peça seis letras e verifique 
 * quantas são consoantes, se for
 * adicione em um array e imprima
 * 
 * */

package arrays;

import java.util.Scanner;

public class receberLetraConfirmaConsoante {

	public static void main(String[] args) {

		
		Scanner ler = new Scanner(System.in);
		//String[] consoantes = {"a","f","s","e"};
		
		String[] consoantes = new String[6];
		int quantidadeConsoantes = 0;
		
		int count = 0;
		
		do {
			System.out.println("Digite uma letra: ");
			String letra = ler.next();
			
			if(!(letra.equalsIgnoreCase("a") | 
					letra.equalsIgnoreCase("e") |
					letra.equalsIgnoreCase("i") |
					letra.equalsIgnoreCase("o") |
					letra.equalsIgnoreCase("u"))
					) {
				
				consoantes[count]=letra;
				quantidadeConsoantes++;
			}
					
			count++;
			
		}while(count<consoantes.length);
		System.out.println("Temos " + quantidadeConsoantes + " consoantes ");
		ler.close();
		
		System.out.println("Consoantes: ");
		for (String consoante : consoantes) {
			
			if(consoante !=null) {
			System.out.print(consoante + " ");
			}
		}
		
	}

}

/*
 * programa que receba 20 n�meros inteiros aleat�rios
 * entre (0 e 100) e armazene-os em um vetor
 * Ao final mostre os n�meros e seus sucessores  
 * */
package arrays;

import java.util.Random;

public class numeAleatoriosSucessores {
	public static void main(String[] args) {
		
		Random gerarNumero = new Random(); 
		
		int[] numerosAleatorios = new int[20];
		
		for(int i= 0; i< numerosAleatorios.length ; i++) {
			int numero = gerarNumero.nextInt(100);
			numerosAleatorios[i]=numero;
		}
		System.out.println("N�meros aleat�rios:");
		for (int i : numerosAleatorios) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nN�meros sucessores :");
		for (int i : numerosAleatorios) {
			System.out.print(i + 1 + " ");
		}
		
		
		

	}
}

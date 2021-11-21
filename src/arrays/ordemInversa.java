/*
 * Crie um vetor com seis numeros
 * inteiros e mostre em ordem inversa
 * 
 * */
package arrays;

public class ordemInversa {
	
	public static void main(String[] args) {

		int[] vetor = {0, -54, 1, 6, -4, 10};
		
		int count=0;
		System.out.println("Vetor: ");
		while(count < vetor.length) {
			System.out.print(vetor[count] + " ");
		count++;
			
		}
						
		System.out.println("\n\nVetor inverso: ");
	
		for(int i = (vetor.length-1); i >=0; i--) {
			
		System.out.print(vetor[i] + " ");
			
		}
		
		
		
	}
}


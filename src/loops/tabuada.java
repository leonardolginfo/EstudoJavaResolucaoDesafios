/*
 *Programa que recebe um n�mero inteiro
 *calcula e mostra uma tabuada 
 *do n�mero inserido de 1 a 10 
 *  
 * */

package loops;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		for(int i=1; i <= 10; i++ ) {
			int multiplica = numero*i;
			System.out.println(numero + " x  " + i + " = " + multiplica);
			
		}
		
		
		ler.close();

	}

}

/*Fa�a um programa que pe�a N n�meros inteiros,
 * que finalize mostrando quantos 
 * pares e quantos �mpares foram informados  
 *  
 * */package loops;

import java.util.Scanner;

public class numerosParesImpares {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int par   = 0;
		int impar = 0;
		int numero;
		int quantidadeNumeros;
		int count=0;
		
		System.out.print("Digite quantos n�meros deseja testar: ");
		quantidadeNumeros = ler.nextInt();
		
		do {
			System.out.println("N�mero: ");
			numero = ler.nextInt();
			
			if(numero%2==0) par++;
			else impar++;
			
			count++;
			
		} while (count < quantidadeNumeros);
		
		ler.close();
		
		System.out.println("Quantidade de pares: " + par);
		System.out.println("Quantidade de �mpares: " + impar);
		

	}

}

/*Fa�a um programa que pe�a N n�meros inteiros,
 * que finalize mostrando quantos 
 * pares e quantos �mpares foram informados  
 *  
 * */package loops;

import java.util.Scanner;

public class numerosParesImpares2VersaoDois {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int par   = 0;
		int impar = 0;
		int numero;
		int controle = 1;
				
		while(controle == 1) {
			
		System.out.println("Digite um n�mero: ");
		numero = ler.nextInt();
		
		Boolean testePar = (numero % 2 == 0) ? true : false;  
						
		if(testePar) {
			par += 1;			
		}else {
			impar+=1;
		}
		
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros �mpares: " + impar);
		
		System.out.println("---------------------------------");
		System.out.println("Quer continuar? 1-Continuar  2-Parar ");
		System.out.println("---------------------------------");
		controle = ler.nextInt();
			
						
		}
		ler.close();
		System.out.println("Programa encerrado");

	}

}

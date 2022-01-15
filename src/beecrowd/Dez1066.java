package beecrowd;

import java.util.Scanner;

public class Dez1066 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int quantidadeNumeros = 5;
		int countNum = 0;
		
		int numero;
		
		int par = 0, impar = 0, positivo = 0, negativo = 0;
		
		while (countNum < quantidadeNumeros ) {
			/*System.out.println("Digite um número");*/
			numero = ler.nextInt();	
			countNum++;
			
			Boolean ePar = numero % 2 == 0;
			Boolean ePos = numero > 0;
			Boolean eZero = numero == 0;
		
		if (ePar && ePos) {
			par++;
			positivo++;
		} else if (ePar && !ePos && !eZero) {
			par++;
			negativo++;
		}else if (!ePar && !ePos ){
			impar++;
			negativo++;
		}else if (ePos && !ePar) {
			positivo++;
			impar++;
		}else{
			par++;
		}
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");
		
		ler.close();
		

	}

}

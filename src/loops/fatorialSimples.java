/*O programa deve receber um número inteiro
 * calcular o fatorial e printar 
 * 
 * */
package loops;

import java.util.Scanner;

public class fatorialSimples {

	public static void main(String[] args) {
		
		int numero;

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro");
		numero = ler.nextInt();
		int multiplica = 1;
		
		System.out.print(numero + "! = ");
		for(int count = numero ; count >= 1; count--) {
			multiplica = multiplica * count;
					}
		System.out.println(multiplica);
		ler.close();
	}

}

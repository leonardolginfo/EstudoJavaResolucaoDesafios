/*
 * O programa deve gerar uma matriz 4x4
 * preencher com números randomicos de 0 a 9 
 * 
 * */
package arrays;


import java.util.Random;

public class arrayMultimendisional {

	public static void main(String[] args) {

		Random gerar = new Random();

		int[][] matriz = new int[4][4];
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				matriz[i][j]=gerar.nextInt(50);
				}
			
		}
		
		for ( int[] linha : matriz) {
			for (int coluna : linha) {
				System.out.print(coluna + " ");
				}
			System.out.println();
		}
	
		int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);
		
	}

}

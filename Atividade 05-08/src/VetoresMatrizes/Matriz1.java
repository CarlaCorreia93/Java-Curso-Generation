/**
 * 
 */
package VetoresMatrizes;

import java.util.Scanner;

/**
 * @author pontofrio
 *Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
 */
public class Matriz1 {

	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		int[][] matrizn1 = new int[2][3];
		
		int[][] matrizn2 = new int[2][3]; 
		
		int[][] matrizM1 = new int[2][3];
		
		int[][] matrizM2 = new int[2][3];
				
		
		for(int i=0;i < 2 ; i++){    
			
			for(int j=0;j<3;j++){
				
				System.out.printf("Digite o valor [%d][%d] da matriz N1", i, j);
				matrizn1[i][j] = entrada.nextInt();
				System.out.printf("Digite o valor [%d][%d] da matriz N2", i, j);
				matrizn2[i][j] = entrada.nextInt();
				
				
				matrizM1[i][j] = matrizn1[i][j] + matrizn2[i][j];
				matrizM2[i][j] = matrizn1[i][j] - matrizn2[i][j];
			}
			System.out.println();
		}
		
		// ------------------------------------------------------------------------------------------------------------------------------------
		for (int i = 0; i < 50; ++i) System.out.println (); 
		
		System.out.println("Imprimindo a matriz N1: \n");
		for(int i=0;i < 2 ; i++){ 
			for(int j=0;j<3;j++){				
				System.out.print(matrizn1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("Imprimindo a matriz N2: \n");  
		for(int i=0;i < 2 ; i++){ 
			for(int j=0;j<3;j++){				
				System.out.print(matrizn2[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Imprimindo a matriz SOMA N1 + N2: \n");
		for(int i=0;i < 2 ; i++){
			for(int j=0;j<3;j++){				
				System.out.print(matrizM1[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Imprimindo a matriz SUBTRACAO N1 - N2: \n");   
		for(int i=0;i < 2 ; i++){
			for(int j=0;j<3;j++){				
				System.out.print(matrizM2[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
	}
}



	

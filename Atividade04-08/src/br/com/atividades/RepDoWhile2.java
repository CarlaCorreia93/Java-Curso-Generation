package br.com.atividades;

import java.util.Scanner;

/**
 * @author CarlaCorreia
 *5 Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 *No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
public class RepDoWhile2 {

	public static void main(String[] args) {
		
		int num; 
		int soma=0;
				
		Scanner ler = new Scanner(System.in); 
		
		do {
		
		System.out.println("Digite um n�mero: ");
		num = ler.nextInt();
		
		soma = soma + num;
		}
		
		while(num != 0);
		
		
		ler.close();
		
		System.out.printf("Soma = %d", soma);
						
	}
}

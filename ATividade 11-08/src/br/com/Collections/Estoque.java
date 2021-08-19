package br.com.Collections;

import java.util.ArrayList;

/* Crie uma um programa para trabalhar com estoque de uma loja, o programa deve
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deve atender as seguintes características:
Armazenar dados da lista
Remover dados da lista;
Atualizar dados da lista.
Apresentar todos os dados da lista. 
*/

public class Estoque {

	public static void main(String[] args) {
		String estoque1 = "Carregador";
		String estoque2 = "Fone";
		String estoque3 = "Capinha";
		String estoque4 = "Película";
		String estoque5 = "Relógio";
		
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add(estoque1);
		estoque.add(estoque2);
		estoque.add(estoque3);
		estoque.add(estoque4); 
		estoque.add(estoque5);
		
		System.out.println(estoque);
		
		estoque.add(estoque5);
		System.out.println(estoque);
		
		estoque.remove(0);
		System.out.println(estoque);
		
		estoque.remove(3);
		System.out.println(estoque);
		
		for(String i: estoque) {
			System.out.println("Temos os produtos: " + i);
		}
		

	}

}

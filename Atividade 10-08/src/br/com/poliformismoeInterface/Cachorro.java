package br.com.poliformismoeInterface;

public class Cachorro extends Animal implements AnimalInter {

	public void movimento() {
		System.out.println("Movimenta��o: Corre, pula e rola");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som: latido");
		
	}	

}

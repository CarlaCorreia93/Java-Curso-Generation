package br.com.poliformismoeInterface;

public class Cavalo extends Animal implements AnimalInter{

	public void movimento() {
		System.out.println("Movimenta��o: corre e pula (alta velocidade)");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som : relincho");
		
	}
}

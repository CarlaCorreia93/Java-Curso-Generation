package br.com.poliformismoeInterface;

public class Preguiça extends Animal implements AnimalInter{

	public  void  movimento () {
		 System.out.println( "Movimentação: agarra arvores " );
	}

	@Override
	public void emitirSom() {
		System.out.println ("Som: grito " );
		
	}
	
	
}

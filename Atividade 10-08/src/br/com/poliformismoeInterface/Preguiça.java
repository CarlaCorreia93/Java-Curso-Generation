package br.com.poliformismoeInterface;

public class Pregui�a extends Animal implements AnimalInter{

	public  void  movimento () {
		 System.out.println( "Movimenta��o: agarra arvores " );
	}

	@Override
	public void emitirSom() {
		System.out.println ("Som: grito " );
		
	}
	
	
}

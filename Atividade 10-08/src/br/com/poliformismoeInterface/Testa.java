package br.com.poliformismoeInterface;

public class Testa {

	public static void main(String[] args) {
		
		Cavalo Cavalo1 =  new Cavalo   ();
		Cachorro C�o =  new  Cachorro ();
		Pregui�a Pregui�a1 =  new Pregui�a   ();
		AnimalInter anima =  new  Cavalo ();
		Cavalo1.setNome ( " Mangalarga " );
		Cavalo1.setIdade ( 5 );
		
		C�o.setNome ( " Rottweile " );
		C�o.setIdade ( 3 );
		
		Pregui�a1.setNome ( " Pregui�a-Bart� " );
		Pregui�a1.setIdade ( 13 );
		
		anima =  new  Cavalo ();
		System.out.println("Cavalo"); 
		System.out.println("Ra�a do Animal: "  + Cavalo1.getNome ());
		System.out.println("Idade: "  + Cavalo1.getIdade ());
		anima . emitirSom ();
		anima . movimento ();
		System.out.println ();
		
		anima =  new  Cachorro ();
		System.out.println("Cachorro"); 
		System.out.println ("Ra�a do Animal: " + C�o.getNome ());
		System.out.println ("Idade: " + C�o.getIdade ());
		anima . emitirSom ();
		anima . movimento ();
		System.out.println ();
		
		anima =  new  Pregui�a ();
		System.out.println("Pregui�a"); 
		System.out.println("Ra�a do Animal: "  + Pregui�a1.getNome ());
		System.out.println ("Idade: "  + Pregui�a1.getIdade ());
		anima . emitirSom ();
		anima . movimento ();
	}

}

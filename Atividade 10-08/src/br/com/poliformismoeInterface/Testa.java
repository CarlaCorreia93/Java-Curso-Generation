package br.com.poliformismoeInterface;

public class Testa {

	public static void main(String[] args) {
		
		Cavalo Cavalo1 =  new Cavalo   ();
		Cachorro Cão =  new  Cachorro ();
		Preguiça Preguiça1 =  new Preguiça   ();
		AnimalInter anima =  new  Cavalo ();
		Cavalo1.setNome ( " Mangalarga " );
		Cavalo1.setIdade ( 5 );
		
		Cão.setNome ( " Rottweile " );
		Cão.setIdade ( 3 );
		
		Preguiça1.setNome ( " Preguiça-Bartô " );
		Preguiça1.setIdade ( 13 );
		
		anima =  new  Cavalo ();
		System.out.println("Cavalo"); 
		System.out.println("Raça do Animal: "  + Cavalo1.getNome ());
		System.out.println("Idade: "  + Cavalo1.getIdade ());
		anima . emitirSom ();
		anima . movimento ();
		System.out.println ();
		
		anima =  new  Cachorro ();
		System.out.println("Cachorro"); 
		System.out.println ("Raça do Animal: " + Cão.getNome ());
		System.out.println ("Idade: " + Cão.getIdade ());
		anima . emitirSom ();
		anima . movimento ();
		System.out.println ();
		
		anima =  new  Preguiça ();
		System.out.println("Preguiça"); 
		System.out.println("Raça do Animal: "  + Preguiça1.getNome ());
		System.out.println ("Idade: "  + Preguiça1.getIdade ());
		anima . emitirSom ();
		anima . movimento ();
	}

}

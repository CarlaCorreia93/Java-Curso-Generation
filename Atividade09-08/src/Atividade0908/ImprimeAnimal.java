package Atividade0908;

public class ImprimeAnimal {

public static void main(String[] args) {
		
		TestaAnimal ta = new TestaAnimal();
		
		ta.somAnimal(new Cavalo());
		ta.correr(new Cavalo());
		
		ta.somAnimal(new Cachorro());
		ta.subir(new Preguiça());

	}

}


/**
 * 
 */
package br.com.atividades;
/**
 * @author CarlaCorreia
 *1 Informar todos os n�meros de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */
public class RepFOR1 {

	public static void main(String[] args) {
		
		int i= 1000;
		
		for (i = 1000; i<2000; i++) {	
			if (i%11==5) {
				
				System.out.println(i);
			}
				

		}

	}
	
}
package vetores;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);
		 
		 // aqui abaixo tá vetor
		 
		int vetorInteiros [] = { 1, 2, 3, 4, 5};
		
		float [] vetorFloat= new float[5];
		
		for (int contador = 0; contador < vetorInteiros.length; contador ++)
			System.out.println(" Posição " + contador + " = " + vetorInteiros[contador] );

		for( int indice = 0; indice < vetorFloat.length; indice ++) {
			System.out.println("Digite um valor para posição [ "  + indice + "] ");
			vetorFloat [indice] = leia.nextFloat(); 
			
		}
		
		Arrays.sort(vetorFloat);
		
		for ( float numero : vetorFloat)
			System.out.println(numero);
		
Arrays.sort(vetorFloat, Collections.revereOrder());
		
		for ( float numero : vetorFloat)
			System.out.println(numero);
			
			
			leia.close();
	}

}

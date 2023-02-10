package aula_03;

import java.util.Scanner;

public class exerci05doWhile {

	public static void main(String[] args) {
		
     Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			
			System.out.println("Digite o numero: ");
			numero = leia.nextInt();
		    
			
			Soma += numero;
			
		} while (numero > 0 || numero < 0);
		System.out.println("A soma de todos números é: " + soma);
			
}
}

	
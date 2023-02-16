package Aula_5;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio03collections {
	
	

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set <Integer> numeros = new HashSet <Integer>();
		int numero;
		
		for (int i = 0 ; i < 10; i ++) {
			System.out.println(" Escreva o número: ");
			numero = leia.nextInt();
			numeros.add(numero);
		}
		
		System.out.println("Sem Iterator");
		for (var num: numeros)
		System.out.println(num);
		
		System.out.println(" Com Iterator");
		Iterator <Integer>inumeros = numeros.iterator();
		
		
		while (inumeros.hasNext())
			System.out.println(inumeros.next());
		
		

	}

}

package aula_2;

import java.util.Scanner;

public class ativi01If {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c; 
		int soma;
		
		
		System.out.println("Digite o valor de a : ");
		a = leia.nextInt();
		System.out.println("Digite o valor de b : ");
		b = leia.nextInt();
		System.out.println("Digite o valor de c : ");
		c = leia.nextInt();
		
		soma = (a + b);
		
		if (soma > c) {
			System.out.println(" A soma de A + B é maior que c");
		}
		if (soma < c) {
				System.out.println(" A soma de A + B é menor que c");
		}	
		if (soma==c) {
				System.out.println(" A soma de A + B é igual a c");
			}
		
		}
		}
		
		
		
		



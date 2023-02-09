package aula_2;

import java.util.Scanner;

public class PlanoSaudeV2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		

		int faixa;
		
		System.out.println("Faixas Estárias");
		
		System.out.println("1-\taté 10 anos");
				
		System.out.println("2-\taté 11 anos até 29 anos ");
				
		System.out.println("3-\taté 30 a 45 anos ");
				
		System.out.println("4-\taté 46 a 59 anos");
				
		System.out.println("5-\taté 60 a 65 anos");
		
		System.out.println("6-\tacima de 65 anos \n\n ");
		
		System.out.println("Digite a sua faixa etária :");
		
		faixa = leia.nextInt();
		
		
		switch(faixa) {
		
		case 1: 
			System.out.println("O valor do plano de saúde será de 100,00");
			break;
			
		case 2: 
			System.out.println("O valor do plano de saúde será de 200,00");
			break;
			
		case 3: 
			System.out.println("O valor do plano de saúde será de 300,00");
			break;
		case 4: 
			System.out.println("O valor do plano de saúde será de 500,00");
			break;
			
		case 5: 
			System.out.println("O valor do plano de saúde será de 600,00");
			break;
			
		case 6: 
			System.out.println("O valor do plano de saúde será de 1000,00");
			break;
			
			default:
			System.out.println("Faixa etária Invalida");
			
		}
		
		leia.close();
		
		

	}

}

package aula_03;

import java.util.Scanner;

  public class tabuada {

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner(System.in);
		
		int numero;
		boolean ok = false;
		String continua;
		
		
		do {
			do {
				System.out.println("Digite a tabuada que deseja calcular: ");
				numero = leia.nextInt();
				
				if ( numero < 1 || numero > 10)
					System.out.println("Digite o número entre 1 e 10" );
				else 
					ok = true ;
		
		} while ( ok == false);
				
				for(int contador = 1; contador <= 10; contador ++) {
					System.out.println("\n" + numero + "X" + contador + " = " + (numero * contador));
				}
				
				ok = false;
				
				System.out.println("Deseja continuar (S/N): ");
				leia.skip ("\\R?");
				continua = leia.nextLine();
				
     	} while (continua.equalsIgnoreCase("S"));
				
		leia.close();
		
				
	}			
		
  }	
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	//	do {
	//		System.out.println("Digite a tabuada que deseja calcular: ");
		//	numero = leia.nextInt();
			
			//for(int contador = 1; contador <= 10; contador ++) {
			//	System.out.println("\n" + numero + "X" + contador + " = " + (numero * contador));
			//}
	
		//	} while ( numero < 1 || numero > 10);
			
		//	for(int contador = 1; contador <= 10; contador ++) {
		//		System.out.println("\n" + numero + "X" + contador + " = " + (numero * contador));
		//	}
			
			
		//	leia.close();
			
				

//	}}


package aula_03;

import java.util.Scanner;

public class exercicio_lacoFor {
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	int numero1, numero2;
	
			System.out.println("Digite o primeiro numero: ");
			numero1 = leia.nextInt();
	
			System.out.println("Digite o último numero: ");
		
			numero2 = leia.nextInt();
		
		if (numero1 < numero2) {
			
			for(int contador = numero1; contador <= numero2; contador ++) {
		
				if (contador % 3 == 0 && contador % 5 == 0) {
					System.out.println(contador);
				}
			}
			
				
		} else {
     		 System.out.println(" Valor invalido ");
		}
		
        leia.close();


}
}

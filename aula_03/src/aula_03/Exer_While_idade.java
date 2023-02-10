package aula_03;

import java.util.Scanner;

public class Exer_While_idade {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroInicial = 1, idadeMenor = 0, idadeMaior = 0;
		
		while (numeroInicial >= 0) {
			System.out.println("Digite a idade: ");
			numeroInicial = leia.nextInt();
			
			if (numeroInicial < 0) {
				System.out.println(" Terminouuu \n");
				
			} else {
				if (numeroInicial <21 && numeroInicial!= 0) {
					idadeMenor +=1;
					
				}else if (numeroInicial > 50) {
					idadeMaior += 1;
				}
			}
		}
		
		System.out.println("TOTAL DE PESSOAS COM MENOS DE 21 ANOS SÃO: " + idadeMenor);
		System.out.println("TOTAL DE PESSOAS COM MAIS DE 50 ANOS SÃO: " + idadeMaior);
		
		
		
		
		
		
		

}
}


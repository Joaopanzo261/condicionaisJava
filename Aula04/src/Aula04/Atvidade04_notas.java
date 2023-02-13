package Aula04;

import java.util.Scanner;

public class Atvidade04_notas {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float matriz [][] = new float[3] [4];	
		float media [] = new float [3];
		float soma = 0.0f;
		
		for (int linha = 0; linha < matriz.length; length ++) {
			for ( int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				System.out.println("Digite a nota: ");
				matriz[linha][coluna] = leia.nextFloat();
			}
		}
		
		for (int linha = 0; linha < matriz.length; length ++) {
			for ( int coluna = 0; coluna < matriz[linha].length; coluna ++) {
				soma += matriz[linha][coluna];
			}
			media[linha]= soma / matriz[linha].length;
			soma = 0.0f;
		}
		for (var medias: media)
			System.out.println(medias);
		
		leia.close();
		
	}
	
}
		

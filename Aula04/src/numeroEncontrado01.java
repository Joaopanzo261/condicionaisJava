import java.util.Scanner;

public class numeroEncontrado01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		int numero, posicao = 0;
		boolean encontrado = false;
		
		System.out.println("Qual numero quer encontrar ? ");
		numero = leia.nextInt();
		
		for (int indice = 0; indice < vetor.length; indice ++) {
			if(vetor[indice] == numero) {
				posicao = indice;
				encontrado = true;
			}
		}
		if (encontrado == true) {
			System.out.println("O numero " + numero + " Está localizado na posição: " + posicao);
		}else {
			System.out.println(" O número " + numero + " não foi encontrado ");
			
			leia.close();
		}
	}
	
}

import java.util.Scanner;

public class vetoresEx01inteiros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numeroInteiros [] = new int [10];
		float soma = 0, media;
		
		for (int contador = 0; contador < numeroInteiros.length; contador ++) {
			System.out.println("Digite o numero: ");
			int numero = leia.nextInt();
			numeroInteiros[contador] = numero;
		}
		for (int contador = 0; contador < numeroInteiros.length; contador ++) {
			if (contador % 2 != 0);
			System.out.println("Elementos impares: " + numeroInteiros[contador]);
		}
		
		for (int contador = 0; contador < numeroInteiros.length; contador ++) {
			if (contador % 2 == 0);
			System.out.println("Elementos pares: " + numeroInteiros[contador]);

	}
		for (int contador = 0; contador < numeroInteiros.length; contador ++) {
			soma = numeroInteiros[contador] + soma;
			
		}
		
		System.out.println("Soma" + soma);
		
		leia.close();

}
}

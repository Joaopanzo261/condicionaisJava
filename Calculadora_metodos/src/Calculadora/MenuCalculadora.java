package Calculadora;


import java.util.Scanner;



public class MenuCalculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Calculos calc = new  Calculos();
		int opcao;
		double numero1, numero2;
		
		
		while (true) {
			
		System.out.println("1- para soma: ");
		System.out.println("2- para subtracao: ");
		System.out.println("3- para multiplicacao: ");
		System.out.println("4- para divisão: ");
		
		System.out.println("Digite o numero da operação: ");
		opcao = leia.nextInt();
		
			
		System.out.println("Digite o primeiro numero: ");
		numero1 = leia.nextDouble();
		
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leia.nextDouble();
		
		
		if (opcao == 0) {
			leia.close();
			System.exit(0);
		}
		
		switch (opcao) {
		case 1 -> System.out.println("Soma: " + calc.soma(numero1, numero2));
		case 2 -> System.out.println("Subtração: " + calc.subtracao(numero1, numero2));
		case 3 -> System.out.println("Multiplicação: " + calc.multiplicacao(numero1, numero2));
		case 4 -> System.out.println("Divisãi: " + calc.divisao(numero1, numero2));
		
		default -> System.out.println("Opção Invalida");
		}
		
	}
		
		
		
}

}

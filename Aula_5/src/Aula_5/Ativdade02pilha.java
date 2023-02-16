package Aula_5;

import java.util.Scanner;
import java.util.Stack;


public class Ativdade02pilha {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack <String> livros = new Stack <String> ();
		
		int opcao = 6;
		String nomeDolivro;
		
		do {
			System.out.println(" (1) Adicionar Livro na Pilha: ");
			System.out.println(" (2) Listar todos os Livros: ");
			System.out.println(" (3) Retirar Livro da Pilha: ");
			System.out.println(" (0) sair: ");
			System.out.println(" (3) Retirar Livro da Pilha: ");
			
			opcao = leia.nextLine();
			
			switch (opcao){
			
			case 1:
				System.out.println(" Digite a opção desejada: ");
				leia.skip("\\R?");
				nomeDolivro = leia.nextLine();
				livros.push(nomeDolivro);
				System.out.println(" Pilha");
				livros.forEach(System.out::println);
				System.out.println("Livro adicionado. ");
				break;
				
			case 2:
				System.out.println(" lista de livros encontrados na pilha: ");
				livros.forEach(System.out::println);
				break;
				
			case 3:
				System.out.println(" A pilha: ");
				livros.pop();
				System.out.println(" Um livro foi retirado da pilha: ");
				break;
				
			default:
				System.out.println("Programa Terminado");
				
				
			}	
				
		} while (opcao != 0);
			
			
		}
		
		

}


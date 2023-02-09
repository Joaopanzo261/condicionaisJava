package aula_2;

import java.util.Scanner;

public class ExercicioSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String nome;
		float salario;
		int codigo;
		

		System.out.println("Selecione um codigo de acordo com tela abaixo");
		
		System.out.println("1-\t Gerente");
				
		System.out.println("2-\t Vendedor ");
				
		System.out.println("3-\t Supervisor ");
				
		System.out.println("4-\t Motorista");
				
		System.out.println("5-\t Estoquista");
		
		System.out.println("6-\t Tecnico TI");
		
	
		System.out.println("Digite o seu codigo ");
		codigo = leia.nextInt();
		
		
		System.out.println("Digite o seu nome");
		leia.skip("\\R?");
		nome = leia.nextLine();
		
		
		System.out.println("Digite o salario");
		salario = leia.nextFloat();
		
switch(codigo) {
		
		case 1: 
		System.out.println("O colaborador " + nome + " Possui codigo " + codigo  + " com novo salario de " + (salario + (salario*10)/100) );
		break;
			
		case 2: 
		System.out.println("O colaborador "  + nome + " Possui codigo "  + codigo +   " com novo salario de " + (salario + (salario*7)/100) );
				break;
			
		case 3: 
		System.out.println("O colaborador " + nome + " Possui codigo " + codigo  + " com novo salario de " + (salario + (salario*9)/100) );
		break;
		
		case 4: 
		System.out.println("O colaborador " + nome + " Possui codigo " + codigo  + " com novo salario de " + (salario + (salario*6)/100) );
		break;
			
		case 5: 
		System.out.println("O colaborador " + nome + " Possui codigo " + codigo  + " com novo salario de " + (salario + (salario*5)/100) );
		break;
			
		case 6: 
		System.out.println("O colaborador " + nome + " Possui codigo " + codigo  + " com novo salario de " + (salario + (salario*8)/100) );
		break;
			
			default:
			System.out.println("Não existe");
		leia.close();
			
		}
			
	}
}
		




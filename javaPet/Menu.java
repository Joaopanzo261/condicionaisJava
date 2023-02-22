package javaPet;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao = 1;
		
		do {
			
			System.out.println("         *******************************************************");
            System.out.println("         *                                                     *");
            System.out.println("         *                 INSTITUTO JAVA PET                  *");
            System.out.println("         *                                                     *");
            System.out.println("         *******************************************************");
            System.out.println("         *        1 - Cadastrar novo animal                    *");
            System.out.println("         *        2 - Listar todos animais                     *");
            System.out.println("         *        3 - Buscar animal por ID                     *");
            System.out.println("         *        4 - Atualizar Dados do Animal                *");
            System.out.println("         *        5 - Apagar Cadastro do Animal                *");
            System.out.println("         *        6 - Estoque                                  *");
            System.out.println("         *        0 - Sair                                     *");
            System.out.println("         *******************************************************\n\n");
			System.out.println("Informe a opção desejada:");
			opcao = leia.nextInt();
			
			if (opcao == 0) {
				System.out.println("\nPrograma Finalizado - Instituto Java PET");
				leia.close();
				System.exit(0);
			}
				
			
			switch(opcao) {
			case 1:
				System.out.println("Cadastrar novo animal:");
				
				break;
				
			case 2:
				System.out.println("Listar todos animais:");
				
				break;
			
			case 3:
				System.out.println("Buscar animal por ID:");
				
				break;
				
			case 4:
				System.out.println("Atualizar dados do animal:");
				
				break;
				
			case 5:
				System.out.println("Apagar cadastro do animal:");
				break;
				
			case 6:
				System.out.println("Estoque:");
				
				break;
				
			default:
				System.out.println("Opção Inválida!");
				break;
			}
			
		} while(opcao != 0);
		
		//leia.close();
	}

}

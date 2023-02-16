package Aula_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class arrayListcollection_exec01 {

	public static void main(String[] args) {
	
		static Scanner solicitado = new Scanner (System.in);
		    
		ArrayList <String> cores = new ArrayList<String>();

		        int i;
		        
		        String cor;

		        for(i  = 0; i < 5; i++) {
		        	
		            System.out.println("Digite a cor: ");
		            
		            cor = solicitado.nextLine();
		            
		            cores.add(cor);

		        }

		        System.out.println("Listar todas as cores: ");
		        
		        cores.forEach(System.out::println);
		        Collections.sort(cores);

		        System.out.println(" Ordenar as cores: ");
		        cores.forEach(System.out::println);



		    }


	}


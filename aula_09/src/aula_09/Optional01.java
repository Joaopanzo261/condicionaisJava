package aula_09;

import java.util.Optional;

public class Optional01 {
	
	
public static void main(String[] args) {
        
		String[] palavras = new String[10];
		String palavra = palavras[5].toLowerCase();
		System.out.println(palavra);
		
		palavras[2] ="Generation Brasil - Turma 61";
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		Optional<String> checaNulo2 = Optional.ofNullable(palavras[5]);
		
		
		if( checaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
			
		}
        
	}




}

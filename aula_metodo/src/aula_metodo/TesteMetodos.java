package aula_metodo;

import static aula_metodopacote2.Classe2.*;



public class TesteMetodos {

	public static void main(String[] args) {
		metodoPublic();
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		
		Classe1.metodoPublico1();
		Classe1.metodoFriendly1();
		Classe1.metodoProtegido1();
		//Classe1.metodoPrivado1();
		
		metodoPublicoPacote1();
		metodoFriendlyPacote1();
		metodoProtegidoPacote1();
		metodoPrivadoPacote1();
		
		
		
		System.out.println(soma(2, 4));
		 
	}
	
	public static void metodoPublic() {
		
		System.out.println(" Eu sou um metodo publico: ");
	}

		public static int soma( int numero1, int numero2){
			
			return numero1 + numero2;
			}
		
		static void metodoPadrao() {
			System.out.println("Eu sou um Método Friendly!");
		}
		
		protected static void metodoProtegido() {
			System.out.println("Eu sou um Método Protegido!");
		}
		
		private static void metodoPrivado() {
			System.out.println("Eu sou um Método Privado!");
		}

}

package aula07;

public class TestaAtleta {

	public static void main(String[] args) {
		
		Triatleta at1 = new Triatleta(" Kiala");
		Triatleta at2 = new Triatleta(" Panzo");
		
		
		at1.aquecer();
		at1.correr();
		
		at2.aquecer();
		at2.pedalar();
		at2.nadar();
		
		

	}

}

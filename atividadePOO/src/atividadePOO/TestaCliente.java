package atividadePOO;

public class TestaCliente {

	public static void main(String[] args) {
		
	//	Cliente c1 = new Cliente(3, "João Panzo", 34, "Rua Prof. Miguel Costa, nº 123", 1191353459);

	//	Cliente c2 = new Cliente(03, "Carlos Pedro", 50, "Rua Prof. Gilberto Antunes, nº 123", 1191457426);

		PessoaFisica pf= new PessoaFisica(02, "Carlos Pedro", 20, "Rua Prof. Gilberto Antunes, nº 123", 1293457626, "710.685.718-19", 1300.0f);
		
		PessoaJuridica pj = new PessoaJuridica(235, "João Kiala", 20, "Rua Adalgiza Maria, nº 123", 1195447810, "710.685.718-19", 10000.0f);
		
	//	c1.visualizar();
	//	c2.visualizar();
		
		pf.visualizar();
		pj.visualizar();
	//	System.out.println("\n");
		
		
	
		
		
		
	}

}

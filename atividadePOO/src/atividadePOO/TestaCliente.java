package atividadePOO;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(3, "João Panzo", 34, "Rua Prof. Miguel Costa, nº 123", 1191353459);

		Cliente c2 = new Cliente(03, "Carlos Pedro", 50, "Rua Prof. Gilberto Antunes, nº 123", 1191457426);

		
		c1.visualizar();
		c2.visualizar();
		
		
	}

}

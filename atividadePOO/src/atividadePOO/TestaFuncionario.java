package atividadePOO;

public class TestaFuncionario {

	public static void main(String[] args) {
		
	//	Funcionario f1 = new Funcionario(11112, " Rafael Clauber",48, "Analista de produção", "São Paulo" );

	//	Funcionario f2 = new Funcionario(22112, " Carlos Manuel",48, "Supervisor", "Curitiba" );
		
		Gerente g1 = new Gerente(33412, " Rafael Marques",48, "Gerente", "Curitiba", 2,4);
		
		Vendedor v1 = new Vendedor(890443, " João Panzo",36, "Vendedor", "São Paulo", 70, 123);
		
		g1.visualizar();
		
		v1.visualizar();
		
		//f1.visualizar();
	//	f2.visualizar();

	}

}

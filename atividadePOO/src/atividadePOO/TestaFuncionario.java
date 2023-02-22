package atividadePOO;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario(11112, " Rafael Clauber",48, "Analista de produção", "São Paulo" );

		Funcionario f2 = new Funcionario(22112, " Carlos Manuel",48, "Supervisor", "Curitiba" );
		
		f1.visualizar();
		f2.visualizar();

	}

}

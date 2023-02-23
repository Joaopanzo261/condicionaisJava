package atividadePOO;

public class Gerente extends Funcionario {
	
	private int numeroProjetos;
	private int qtdEquipeSupervisionado;
	
	public Gerente(long numeroSerie, String nomeCompleto, int cargaHoraria, String cargo, String localTrabalho,
			int numeroProjetos, int qtdEquipeSupervisionado) {
		super(numeroSerie, nomeCompleto, cargaHoraria, cargo, localTrabalho);
		this.numeroProjetos = numeroProjetos;
		this.qtdEquipeSupervisionado = qtdEquipeSupervisionado;
	}

	public int getNumeroProjetos() {
		return numeroProjetos;
	}

	public void setNumeroProjetos(int numeroProjetos) {
		this.numeroProjetos = numeroProjetos;
	}

	public int getQtdEquipeSupervionado() {
		return qtdEquipeSupervisionado;
	}

	public void setQtdEquipeSupervionado(int qtdEquipeSupervionado) {
		this.qtdEquipeSupervisionado = qtdEquipeSupervisionado;
	}
	
	public void visualizar() {
		super.visualizar();
		
		System.out.println("O Número de Projetos Gerenciados São: " + this.numeroProjetos + " " + "projetos");
		System.out.println("\n");
		System.out.println("A Quantidade de Equipe Supervisionado: " + this.qtdEquipeSupervisionado + " " + "equipes");
		
	}

}

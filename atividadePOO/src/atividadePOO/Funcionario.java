package atividadePOO;

public class Funcionario {

	private long numeroSerie;
	private String nomeCompleto;
	private int cargaHoraria;
	private String cargo;
	private String localTrabalho;
	
	
	public Funcionario(long numeroSerie, String nomeCompleto, int cargaHoraria, String cargo, String localTrabalho) {
		this.numeroSerie = numeroSerie;
		this.nomeCompleto = nomeCompleto;
		this.cargaHoraria = cargaHoraria;
		this.cargo = cargo;
		this.localTrabalho = localTrabalho;
	}


	public long getNumeroSerie() {
		return numeroSerie;
	}


	public void setNumeroSerie(long numeroSerie) {
		this.numeroSerie = numeroSerie;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public int getCargaHoraria() {
		return cargaHoraria;
	}


	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getLocalTrabalho() {
		return localTrabalho;
	}


	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}
	
public void visualizar () {
		
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("              DADOS DO FUNCIONARIO               ");
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println(" \nNúmero da Série: " + this.numeroSerie);
		System.out.println(" \nNome complento do Funcionário: " + this.nomeCompleto);
		System.out.println(" \nCarga Horária semanal: " + this.cargaHoraria);
		System.out.println(" \nPosição: " + this.cargo);
		System.out.println(" \nLocal de Trabalho: " + this.localTrabalho);
		System.out.println(" \n");
}
	
	
}

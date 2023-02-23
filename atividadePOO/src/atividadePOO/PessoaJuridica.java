package atividadePOO;

public class PessoaJuridica extends Cliente {
	

	private String cadastroPessoajuridica;
	private float impostoRendapessoaJuridica;
	
	
	
	public PessoaJuridica(long codigoCliente, String nomeCompleto, int idade, String endereco, int telefone,
			String cadastroPessoajuridica, float impostoRendapessoaJuridica) {
		super(codigoCliente, nomeCompleto, idade, endereco, telefone);
		this.cadastroPessoajuridica = cadastroPessoajuridica;
		this.impostoRendapessoaJuridica = impostoRendapessoaJuridica;
	}

	
	
	public String getCadastroPessoajuridica() {
		return cadastroPessoajuridica;
	}



	public void setCadastroPessoajuridica(String cadastroPessoajuridica) {
		this.cadastroPessoajuridica = cadastroPessoajuridica;
	}



	public float getImpostoRendapessoaJuridica() {
		return impostoRendapessoaJuridica;
	}



	public void setImpostoRendapessoaJuridica(float impostoRendapessoaJuridica) {
		this.impostoRendapessoaJuridica = impostoRendapessoaJuridica;
	}



	public void visualizar () {
		super.visualizar();
		
		System.out.println(" Número de CNPJ: " + this.cadastroPessoajuridica);
		System.out.println(" O Imposto a pagar Pessoa Juridica:  " + this.impostoRendapessoaJuridica);
		System.out.println("\n");
		
	}

}

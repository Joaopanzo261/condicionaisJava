package atividadePOO;

public class PessoaFisica extends Cliente {
	
	
	private String cadastroPessoafisica;
	private float impostoRenda;
	
	public PessoaFisica(long codigoCliente, String nomeCompleto, int idade, String endereco, int telefone,
			String cadastroPessoafisica, float impostoRenda) {
		super(codigoCliente, nomeCompleto, idade, endereco, telefone);
		this.cadastroPessoafisica = cadastroPessoafisica;
		this.impostoRenda = impostoRenda;
		
		
	}
	public String getCadastroPessoafisica() {
		return cadastroPessoafisica;
	}
	public void setCadastroPessoafisica(String cadastroPessoafisica) {
		this.cadastroPessoafisica = cadastroPessoafisica;
	}
	public float getImpostoRenda() {
		return impostoRenda;
	}
	public void setImpostoRenda(float impostoRenda) {
		this.impostoRenda = impostoRenda;
	}
	
	public void visualizar () {
		super.visualizar();
		
		System.out.println(" Número de CPF: " + this.cadastroPessoafisica);
		System.out.println("\n");
		System.out.println(" O Imposto a pagar:  " + this.impostoRenda);
		
	}
	
}
	
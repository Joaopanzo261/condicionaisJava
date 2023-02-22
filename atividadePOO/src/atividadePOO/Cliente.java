package atividadePOO;

public class Cliente {
	
	private long codigoCliente;
	private String nomeCompleto;
	private int idade;
	private String endereco;
	private int telefone;
	
	
	public Cliente(long codigoCliente, String nomeCompleto, int idade, String endereco, int telefone) {
		this.codigoCliente = codigoCliente;
		this.nomeCompleto = nomeCompleto;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public long getCodigoCliente() {
		return codigoCliente;
	}


	public void setCodigoCliente(long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public void visualizar () {
		
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("              INFORMAÇÕES DO CLIENTE             ");
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println(" \nCodigo do Cliente: " + this.codigoCliente);
		System.out.println(" \nNome complento do Cliente: " + this.nomeCompleto);
		System.out.println(" \nIdade do Cliente: " + this.idade);
		System.out.println(" \nEndereço do Cliente: " + this.endereco);
		System.out.println(" \nTelefone do Cliente: " + this.telefone);
	}
		

}

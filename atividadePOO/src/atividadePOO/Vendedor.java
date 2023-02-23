package atividadePOO;

public class Vendedor extends Funcionario {
	
	private float meta;
	private int estoque;
	
	public Vendedor(long numeroSerie, String nomeCompleto, int cargaHoraria, String cargo, String localTrabalho,
			float meta, int estoque) {
		super(numeroSerie, nomeCompleto, cargaHoraria, cargo, localTrabalho);
		this.meta = meta;
		this.estoque = estoque;
	}

	public float getMeta() {
		return meta;
	}

	public void setMeta(float meta) {
		this.meta = meta;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public void visualizar() {
		super.visualizar();
		
		System.out.println("Meta Antigida em Percentagem: " + this.meta);
		System.out.println("\n");
		System.out.println("Quantidade de Estoque: " + this.estoque );
		
	}
	
	

}

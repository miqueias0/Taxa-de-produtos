package entidades;

public class ProdutoImportado extends Produto{
	
	private Double taxa;
	
	public ProdutoImportado() {
	}

	public ProdutoImportado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public Double precoTotal() {
		return preco + taxa;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + " $ ");
		sb.append(precoTotal());
		sb.append(" (Custo de alfândega: $ " + taxa);
		sb.append(")\n");
		return sb.toString();
	}
}

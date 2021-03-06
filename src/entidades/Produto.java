package entidades;

public class Produto {
	protected String nome;
	protected Double preco;
	
	public Produto(){
		super();
	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + " $ ");
		sb.append(preco + "\n");
		return sb.toString();
	}
	
}

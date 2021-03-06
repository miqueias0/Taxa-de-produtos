package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufaturaData;
	
	public ProdutoUsado() {
	}

	public ProdutoUsado(String nome, Double preco, Date manufaturaData) {
		super(nome, preco);
		this.manufaturaData = manufaturaData;
	}

	public Date getManufaturaData() {
		return manufaturaData;
	}

	public void setManufaturaData(Date manufaturaData) {
		this.manufaturaData = manufaturaData;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + " (usado) $ ");
		sb.append(String.format("%.2f", preco));
		sb.append(" (Data de fabricação: ");
		sb.append(sdf.format(manufaturaData) + ")\n");
		return sb.toString();
	}

}

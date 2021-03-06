package aplica��o;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Produto produto = new Produto();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Quantos produtos ser�o adicionados? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do #" + i + " Produto:");
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Pre�o: ");
			Double preco = sc.nextDouble();
			switch (resp) {
			case 'i':
				System.out.print("Taxa da alf�ndega: ");
				Double taxa = sc.nextDouble();
				produto = new ProdutoImportado(nome, preco, taxa);
				lista.add(produto);
				break;
			case 'u':
				System.out.print("Data de fabrica��o (DD/MM/AAAA): ");
				Date data = sdf.parse(sc.next());
				produto = new ProdutoUsado(nome, preco, data);
				lista.add(produto);
				break;
			default:
				produto = new Produto(nome, preco);
				lista.add(produto);
				break;
			}
		}
		System.out.println("Etiqueta de pre�o:");
		for (Produto c: lista) {
			System.out.print(c);
		}
		sc.close();
	}

}

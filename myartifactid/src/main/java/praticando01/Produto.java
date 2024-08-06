package praticando01;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {
		this.nome = "";
		this.preco = 0.00;
		this.quantidade = 0;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setPreco(double preco) {
		if (preco >= 0) {
			this.preco = preco;
		} else {
			System.out.println("A variável preço deve conter um valor positivo");
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade >= 0) {
			this.quantidade = quantidade;
		} else {
			System.out.println("A variável quantidade deve conter um valor positivo");
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

}

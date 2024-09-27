package ArrayList_ex04;

public class Roupa {
	private String tipo;
	private String tamanho;
	private String cor;
	
	public Roupa(String tipo, String tamanho, String cor) {
		super();
		this.tipo = tipo;
		this.tamanho = tamanho;
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "\nTipo: " + tipo + "\nTamanho: " + tamanho + "\nCor: " + cor;
	}
	
}

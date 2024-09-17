package POO.Exercicios.Exercicio01;

public class Endereco {
	private String rua;
	private int numero;
	private String cidade;
	private String estado;
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public String toString() {
		return "" + estado + ", " + cidade + ", " + rua + ", " + numero;
	}
}

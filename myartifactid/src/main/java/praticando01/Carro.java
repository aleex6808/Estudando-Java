package praticando01;

public class Carro {
	private String marca;
	private String modelo;
	private int ano;
	
	public Carro() {
		this.marca = "";
		this.modelo = "";
		this.ano = 2000;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String toString() {
		return "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno();
	}
}

package POO.Exercicios.Exercicio03;

public class Veiculo {

	// Atributos

	private String marca;
	private String modelo;
	private int ano;

	// Metódos Getters & Setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String exibirDetalhes() {
		return " ----- Dados do Veiculo ------" + "\n Tipo de veículo: "+ this.getClass().getSimpleName() + "\n Marca: " + this.getMarca() + "\n Modelo: " + this.getModelo() + "\n Ano: "
				+ this.getAno();
	}

}

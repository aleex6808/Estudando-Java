package aula07;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitorias(vi);
		this.setDerrotas(de);
		this.setEmpates(em);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setAltura(float d) {
		this.altura = d;
	}

	public float getAltura() {
		return altura;
	}

	public void setPeso(float e) {
		this.peso = e;
		setCategoria();
	}

	public float getPeso() {
		return peso;
	}

	private void setCategoria() {
		if (getPeso() < 52.2) {
			categoria = "Inválido";
		} else if (getPeso() <= 70.3) {
			categoria = "Leve";
		} else if (getPeso() <= 83.9) {
			categoria = "Médio";
		} else if (getPeso() <= 120.2) {
			categoria = "Pesado";
		} else {
			categoria = "Inválido";
		}
	}

	public String getCategoria() {
		return categoria;
	}

	public int setVitorias(int vitorias) {
		return this.vitorias = vitorias;
	}

	public int getVitorias() {
		return vitorias;
	}

	public int setDerrotas(int derrotas) {
		return this.derrotas = derrotas;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public int setEmpates(int empates) {
		return this.empates = empates;
	}

	public int getEmpates() {
		return empates;
	}

	public String Apresentar() {
		return "\n---------------\nIT'S TIME!!! Apresentando ele que veio diretamente de "
				+ this.getNacionalidade() + " com " + this.getIdade() + " anos de idade e " + this.getAltura()
				+ " de altura." + "\nPesando " + this.getPeso() + "Kg\n" + "Possuindo " + this.getVitorias() + " Vitórias,"
				+ this.getDerrotas() + " Derrotas e " +  this.getEmpates() + " Empates"
						+ "\nO lutador " + this.getNome() + "!!!!!!\n---------------";

	}

	public String Status() {
		return "\n----------\n" + this.getNome() + " é um peso " + this.getCategoria() + "\nGanhou "
				+ this.getVitorias() + " Vezes" + "\nPerdeu " + this.getDerrotas() + " Vezes" + "\nEmpatou "
				+ this.getEmpates() + " Vezes\n----------";
	}

	public int ganharLuta() {
		System.out.println("O lutador " + nome + " venceu a luta.");
		return this.setVitorias(this.getVitorias() + 1);
	}

	public int perderLuta() {
		System.out.println("O lutador " + nome + " perdeu a luta.");
		return this.setDerrotas(this.getDerrotas() + 1);
	}

	public int empatarLuta() {
		System.out.println("Empate.");
		return this.setEmpates(this.getEmpates() + 1);
	}
}

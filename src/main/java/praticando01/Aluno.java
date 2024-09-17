package praticando01;

public class Aluno {
	private String matricula;
	private String nome;
	private double nota;
	
	public Aluno() {
		this.matricula = "";
		this.nome = "";
		this.nota = 0;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNota(double nota) {
		if(nota >= 0.0 && nota <= 10.0) {
			this.nota = nota;
		} else {
			System.out.println("Valor inválido.");
		}
	}
	
	public double getNota() {
		return nota;
	}
}

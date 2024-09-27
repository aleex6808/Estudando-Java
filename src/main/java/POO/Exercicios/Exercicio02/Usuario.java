package POO.Exercicios.Exercicio02;

public class Usuario {
    private String nome;
    private int idade;
    private String id;

    public Usuario(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
		return "\n--------------------" + "\nNome: " + nome + "\nIdade: " + idade + "\nID: " + id + "\n--------------------";
	}
}

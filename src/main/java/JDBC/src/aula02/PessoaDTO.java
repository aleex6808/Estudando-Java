package aula02;

public class PessoaDTO {
	private int id;
	private String nome;
	private String email;
	private String cidade;
	private String data_cadastro;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(String data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	@Override
	public String toString() {
		return "PessoaDTO [id=" + id + ", nome=" + nome + ", email=" + email;
	}
	
	

}

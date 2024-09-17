package ArrayList_ex03;

public class Tarefa {
	
	private String descricao;
	private int prioridade;
	private String status;

	public Tarefa(String descricao, int prioridade, String status) {
		super();
		this.descricao = descricao;
		this.prioridade = prioridade;
		this.status = status;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "\n========================="
				+ "\nDados da Tarefa \nDescricao=" + descricao + 
				"\nPrioridade=" + prioridade + 
				"\nStatus=" + status + 
				"\n=========================";
	}

}

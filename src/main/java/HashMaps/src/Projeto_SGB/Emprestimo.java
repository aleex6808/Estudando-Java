package Projeto_SGB;

import java.util.UUID;

public class Emprestimo {
	// Atributos
	
    private String id; // UUID para identificação única
    private String idMembro;
    private String codigo;
    private String dataEmprestimo;
    private String dataDevolucao;
    
    public Emprestimo(String idMembro, String codigo, String dataEmprestimo ) {
        this.id = UUID.randomUUID().toString(); // Gerar um UUID único
        this.idMembro = idMembro;
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = "Emprestado";
    }

    // Métodos Getters & Setters
    
    public String getId() {
        return id;
    }

    public String getIdMembro() {
		return idMembro;
	}

	public void setIdMembro(String idMembro) {
		this.idMembro = idMembro;
	}

	public void setId(String id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    // Método toString()

    @Override
    public String toString() {
        return "\n------------------------\n"
                + "\nID do Empréstimo: " + id
                + "\nID do Membro: " + idMembro
                + "\nCódigo ISBN: " + codigo
                + "\nData do Empréstimo: " + dataEmprestimo
                + "\nData da Devolução: " + dataDevolucao
                + "\n------------------------\n";
    }
}

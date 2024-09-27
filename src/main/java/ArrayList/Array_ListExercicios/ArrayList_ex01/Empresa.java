package ArrayList_ex01;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<Funcionario> funcionarios;
	
	public Empresa() {
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public void adicionarFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	
	public void removerFuncionario(Funcionario funcionario) {
		funcionarios.remove(funcionario);
	}
	
	public void listarFuncionarios() {
		for (Funcionario funcionario: funcionarios) {
			System.out.println(funcionario);
		}
	}
	
	public double calcularMediaSalarial(){
		double total = 0;
		for (Funcionario funcionario: funcionarios) {
			total += funcionario.getSalario();
		}
		return funcionarios.size() > 0 ? total / funcionarios.size() : 0;
	}
}

package ArrayList_ex01;

public class Main {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		Funcionario f1 = new Funcionario("João","Desenvolvimento" , 1500.00);
		Funcionario f2 = new Funcionario("Jorge","QA", 2000.00);
		
		empresa.adicionarFuncionario(f1);
		empresa.adicionarFuncionario(f2);
		
		System.out.println("Lista de Funcionários:");
		empresa.listarFuncionarios();
		
		System.out.println("Média salarial dos funcionários: " + empresa.calcularMediaSalarial());
	}
}

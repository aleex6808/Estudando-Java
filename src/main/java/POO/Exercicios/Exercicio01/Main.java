package POO.Exercicios.Exercicio01;

public class Main {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Alex");
		p.setIdade(20);
		p.setGenero('M');
		
		
		System.out.println("Nome: " + p.getNome());
		if(p.getIdade() > 0) {
			System.out.println("Idade: " +  p.getIdade());
		}
		System.out.println("Gênero: " + p.getGenero());
		
		System.out.println("\n------------ DIVISÃO ---------------");
		
		Aluno a = new Aluno();
		
		a.setNome("Alexander");
		a.setIdade(18);
		a.setGenero('M');
		a.setMatricula("123456789");
		
		System.out.println("Nome: " + a.getNome());
		if(p.getIdade() > 0) {
			System.out.println("Idade: " +  a.getIdade());
		}
		System.out.println("Gênero: " + a.getGenero());
		System.out.println("Matricula: " + a.getMatricula());
		
		System.out.println("\n------------ DIVISÃO ---------------");
		
		Pessoa p2 = new Pessoa();
		Endereco e2 = new Endereco();
		
		p2.setNome("Ale");
		p2.setIdade(19);
		p2.setGenero('M');
		
		e2.setEstado("RJ");
		e2.setCidade("Rio de Janeiro");
		e2.setRua("Vila Valqueire");
		e2.setNumero(482);
		
		p2.setEndereco(e2);
		
		System.out.println(p2.toString());
		
		System.out.println("\n------------ DIVISÃO ---------------");
		
		Pessoa p3 = new Pessoa();
		Endereco e1 = new Endereco();
		
		p3.setNome("Charlie");
		p3.setIdade(24);
		p3.setGenero('N');
		
		e1.setEstado("RJ");
		e1.setCidade("Rio de Janeiro");
		e1.setRua("Vila Valqueire");
		e1.setNumero(482);
		
		p3.setEndereco(e1);
		
		System.out.println("Nome: " + p3.getNome());
		if(p.getIdade() > 0) {
			System.out.println("Idade: " +  p3.getIdade());
		}
		System.out.println("Gênero: " + p3.getGenero());
		System.out.println("Endereço: " + p3.getEndereco());
		
		System.out.println("\n------------ DIVISÃO ---------------");
		
		Turma t1 = new Turma();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		Aluno a5 = new Aluno();
		
		a2.setNome("Alexander");
		a2.setIdade(18);
		a2.setGenero('M');
		a2.setMatricula("123456789");
		
		a3.setNome("Ander");
		a3.setIdade(18);
		a3.setGenero('M');
		a3.setMatricula("123456789");
		
		a4.setNome("Alex");
		a4.setIdade(18);
		a4.setGenero('M');
		a4.setMatricula("123456789");
		
		t1.adicionarAluno(a);
		t1.adicionarAluno(a2);
		t1.adicionarAluno(a3);
		t1.adicionarAluno(a4);
		t1.adicionarAluno(a5);
		t1.removerAluno(a3);
		
		
		System.out.println(t1.getAlunos());
		System.out.println(Pessoa.getContador());
	}
}


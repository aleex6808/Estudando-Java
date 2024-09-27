package praticando01;

public class Main {
	public static void main(String[] args) {
		Produto p = new Produto();
		
		p.setPreco(0);
		p.getPreco();
		p.setQuantidade(0);
		p.getQuantidade();
		
		
		  ContaBancaria c = new ContaBancaria();
		 
		
		System.out.println(c.getSaldo());
		
		c.depositar();
		
		System.out.println(c.getSaldo());
		
		c.sacar();
		
		System.out.println(c.getSaldo());
		
		
		Aluno a = new Aluno();
		
		a.setMatricula("01234");
		a.setNome("Claudio");
		a.setNota(20);
		
		System.out.println(a.getMatricula());
		System.out.println(a.getNome());
		System.out.println(a.getNota());
		
		Carro ca = new Carro();
		
		ca.setMarca("Ford");
		ca.setModelo("KA");
		ca.setAno(2005);
		System.out.println(ca.toString());
	}
}

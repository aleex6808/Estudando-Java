package POO.Exercicios.Exercicio03;

public class Main {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setMarca("Ford");
		c1.setModelo("KA");
		c1.setAno(2017);
		c1.setNumeroPortas(4);
		System.out.println(c1.exibirDetalhes());
		
		Moto m1 = new Moto();
		m1.setMarca("Kawasaki");
		m1.setModelo("Ninja");
		m1.setAno(2022);
		m1.setTemCarroLateral(true);
		System.out.println(m1.exibirDetalhes());
	}
}

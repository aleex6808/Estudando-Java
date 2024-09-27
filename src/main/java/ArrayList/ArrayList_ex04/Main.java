package ArrayList_ex04;

public class Main {
	public static void main(String[] args) {
		Loja loja = new Loja();
		
		Roupa r1 = new Roupa("Camisa", "M", "Preta");
		Roupa r2 = new Roupa("Regata Canelada", "P", "Branca");
		Roupa r3 = new Roupa("Calça Jeans", "38", "Azul claro");
		
		loja.adicionarRoupa(r1);
		loja.adicionarRoupa(r2);
		loja.adicionarRoupa(r3);
		
		System.out.println("Roupas dísponíveis");
		loja.listarRoupas();
		
		loja.removerRoupa(r2);
		
		System.out.println("=====================");
		
		/*Após remover*/
		
		System.out.println("Roupas dísponíveis");
		loja.listarRoupas();
		
		System.out.println("=====================");
		System.out.println("Buscando: ");
		loja.buscarRoupa();
	}
}

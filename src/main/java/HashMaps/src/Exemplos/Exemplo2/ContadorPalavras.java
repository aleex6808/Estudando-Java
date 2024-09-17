package Exemplos.Exemplo2;

import java.util.HashMap;
import java.util.Map;

public class ContadorPalavras {
	private Map<String, Integer> palavrasMap;
	
	public ContadorPalavras() {
		palavrasMap = new HashMap<>();
	}
	
	public void contarPalavras(String texto) {
		String[] palavras = texto.split("\\s+");
		for (String palavra : palavras) {
			palavra = palavra.toLowerCase();
			palavrasMap.put(palavra, palavrasMap.getOrDefault(palavra, 0) + 1);
		}
	}
	
	public void exibirContagem() {
		for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) {
			System.out.println("Palavra: " + entry.getKey() + ", Contagem: " + entry.getValue());
		}
	}
}
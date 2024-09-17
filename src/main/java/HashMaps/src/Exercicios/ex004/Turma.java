package Exercicios.ex004;

import java.util.HashMap;
import java.util.Map;

public class Turma {
	private Map<String, Estudante> estudantes;

	public Turma() {
		this.estudantes = new HashMap<>();
	}
	
	public void adicionarEstudante(Estudante estudante) {
		estudantes.put(estudante.getNome(), estudante);
	}
	
	public void removerEstudante(String nome) {
		estudantes.remove(nome);
	}
	
	public Estudante buscarEstudante(String nomeEstudante) {
		  Estudante estudante = estudantes.get(nomeEstudante);
	        if (estudante != null) {
	            return estudante;
	        } else {
	            System.out.println("Estudante não encontrado");
	            return null;
	        }
	    }
	
	public void listarEstudantes() {
		if(!estudantes.isEmpty()) {
			estudantes.entrySet()
			.stream()
			.sorted(Map.Entry.comparingByKey())
			.forEach(entrada -> System.out.println("Matricula: " + entrada.getKey() + "\nEstudante: " + entrada.getValue()) );
		} else {
			System.out.println("Nenhum estudante encontrado");
		}
	}
}

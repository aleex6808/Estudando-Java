package Exercicios.ex005;

import java.util.Map;
import java.util.HashMap;

public class Agenda {
	private Map<String, Contato> agenda;

	public Agenda() {
		this.agenda = new HashMap<String, Contato>();
	}

	public void addContato(Contato contato) {
		agenda.put(contato.getNome(), contato);
	}

	public void delContato(String nome) {
		agenda.remove(nome);
	}

	public void buscarContato(String nome) {
		Contato contato = agenda.get(nome);
		if (contato != null) {
			System.out.println("Contato encontrado: " + contato);
		} else {
			System.out.println("Contato não encontrado.");
		}
	}

	public void listarContatos() {
        if (!agenda.isEmpty()) {
            for (Map.Entry<String, Contato> entrada : agenda.entrySet()) {
                System.out.println(entrada.getValue());
            }
        } else {
            System.out.println("Nenhum contato encontrado.");
        }
    }
}
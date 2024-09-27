package ArrayList_ex03;

import java.util.ArrayList;

public class GerenciadorDeTarefas {
	private ArrayList<Tarefa> tarefas;

	public GerenciadorDeTarefas() {
		tarefas = new ArrayList<Tarefa>();
	}

	public void adicionarTarefa(Tarefa tarefa) {
		tarefas.add(tarefa);
	}

	public void removerTarefa(Tarefa tarefa) {
		if (tarefas.contains(tarefa)) {
			tarefas.remove(tarefa);
		}
	}

	public void listarTarefas() {
		if (tarefas.size() > 0) {
			for (Tarefa tarefa : tarefas) {
				System.out.println(tarefa);
			}
		} else {
			System.out.println("A lista de tarefas está vazia.");
		}
	}

	public void buscarTarefas(String status) {
		boolean encontrado = false;
		if (tarefas.size() > 0) {
			for (Tarefa tarefa : tarefas) {
				if (tarefa.getStatus().equalsIgnoreCase(status)) {
					System.out.println(tarefa);
					encontrado = true;
				}
			}
		}
		if (!encontrado) {
			System.out.println("Nenhuma tarefa encontrada com o status: " + status);
		}

	}
}

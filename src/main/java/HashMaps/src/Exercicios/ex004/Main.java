package Exercicios.ex004;

public class Main {
    public static void main(String[] args) {
        // Instancia a classe turma
        Turma turma = new Turma();

        // Cria alguns objetos 'Estudante'
        Estudante estudante1 = new Estudante("Estudante 1", 7.0);
        Estudante estudante2 = new Estudante("Estudante 2", 6.0);
        Estudante estudante3 = new Estudante("Estudante 3", 8.5);

        // Adiciona os objetos ao mapa
        turma.adicionarEstudante(estudante1);
        turma.adicionarEstudante(estudante2);
        turma.adicionarEstudante(estudante3);

        // Listar todos os objetos
        System.out.println("Listando todos os estudantes:");
        turma.listarEstudantes();

        // Consultar um objeto específico
        System.out.println("\nConsultando estudante:");
        Estudante estudanteBuscado = turma.buscarEstudante("Estudante 1");
        if (estudanteBuscado != null) {
            System.out.println("Estudante encontrado: " + estudanteBuscado);
        }

        // Remover um estudante e listar novamente
        System.out.println("\nRemovendo estudante e listando novamente:");
        turma.removerEstudante("Estudante 1");
        turma.listarEstudantes();

        // Testar consulta de um estudante que não existe
        System.out.println("\nConsultando estudante inexistente (Estudante 1):");
        Estudante estudanteInexistente = turma.buscarEstudante("Estudante 1");
        if (estudanteInexistente != null) {
            System.out.println("Estudante encontrado: " + estudanteInexistente);
        }
    }
}


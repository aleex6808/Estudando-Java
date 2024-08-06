package POO.Exercicios.Exercicio02;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
        this.usuarios = new ArrayList<Usuario>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void removerUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }

    public void emprestarLivro(String userId, String tituloLivro) {
        Usuario usuario = null;
        Livro livro = null;

        for (Usuario u : usuarios) {
            if (u.getId().equals(userId)) {
                usuario = u;
                break;
            }
        }

        for (Livro l : livros) {
            if (l.getTitulo().equals(tituloLivro)) {
                livro = l;
                break;
            }
        }

        if (usuario != null && livro != null && livro.isDisponivel()) {
            livro.emprestarLivro();
            System.out.println("\nLivro " + tituloLivro + " emprestado para " + usuario.getNome());
        } else {
            System.out.println("Não foi possível emprestar o livro.");
        }
    }

    public void devolverLivro(String tituloLivro) {
        for (Livro l : livros) {
            if (l.getTitulo().equals(tituloLivro)) {
                l.devolverLivro();
                System.out.println("Livro " + tituloLivro + " devolvido.");
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
}

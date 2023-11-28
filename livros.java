import java.util.ArrayList;


class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }
//construtor usando get,somente para retornar
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}

class GerenciadorLivros {
    
    private ArrayList<Livro> listaLivros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        listaLivros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void removerLivro(String titulo) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                listaLivros.remove(livro);
                System.out.println("Livro removido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não encontrado na lista.");
    }

    public void exibirDetalhesLivro(String titulo) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
                return;
            }
        }
        System.out.println("Livro não encontrado na lista.");
    }

    public void listarLivros() {
        for (Livro livro : listaLivros) {
            System.out.println(livro);
        }
    }
}


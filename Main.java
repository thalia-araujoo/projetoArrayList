import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GerenciadorLivros gerenciador = new GerenciadorLivros();

            int opcao;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Adicionar Livro");
                System.out.println("2. Remover Livro");
                System.out.println("3. Exibir Detalhes de um Livro");
                System.out.println("4. Listar Todos os Livros");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");

                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o título do livro: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Digite o autor do livro: ");
                        String autor = scanner.nextLine();
                        System.out.print("Digite o ano de publicação do livro: ");
                        int anoPublicacao = scanner.nextInt();
                        gerenciador.adicionarLivro(new Livro(titulo, autor, anoPublicacao));
                        break;
                    case 2:
                        System.out.print("Digite o título do livro a ser removido: ");
                        String tituloRemover = scanner.nextLine();
                        gerenciador.removerLivro(tituloRemover);
                        break;
                    case 3:
                        System.out.print("Digite o título do livro para exibir os detalhes: ");
                        String tituloExibir = scanner.nextLine();
                        gerenciador.exibirDetalhesLivro(tituloExibir);
                        break;
                    case 4:
                        System.out.println("Listagem de Todos os Livros:");
                        gerenciador.listarLivros();
                        break;
                    case 5:
                        System.out.println("Saindo do programa. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } while (opcao != 5);
        }
    }
}

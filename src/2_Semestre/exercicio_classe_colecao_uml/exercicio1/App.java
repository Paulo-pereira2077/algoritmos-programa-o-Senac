import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        Tela tela = new Tela();
        Blacklist blacklist = new Blacklist();

        int opcao = -1;

        tela.titulo();

        do {
            System.out.println("\n === Menu ===");
            System.out.println("1. Novo Nome");
            System.out.println("2. Alterar Nome");
            System.out.println("3. Exibir Lista");
            System.out.println("4. Remover Nome");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            if (entrada.hasNextInt()) {
                opcao = entrada.nextInt();
                entrada.nextLine();
            } else {
                System.out.println("\nOpção inválida! Digite um número.");
                entrada.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome a ser adicionado: ");
                    String novoNome = entrada.nextLine();
                    blacklist.adicionar(novoNome);
                    break;
                
                case 2:
                    System.out.print("Digite a posição (índice) para alterar: ");
                    int posAlterar = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Digite o novo nome: ");
                    String nomeNovo = entrada.nextLine();
                    blacklist.alterar(posAlterar, nomeNovo);
                    break;
                
                case 3:
                    blacklist.listar();
                    break;

                case 4:
                    System.out.print("Digite a posição (índice) para remover: ");
                    int posRemover = entrada.nextInt();
                    entrada.nextLine();
                    blacklist.remover(posRemover);
                    break;
                
                case 0:
                    System.out.println("\n Programa encerrado. Até mais!");
                    break;
                
                default:
                    System.out.println("\n Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);
        
        entrada.close(); // Fechar o Scanner ao sair
    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Blacklist blacklist = new Blacklist();
        int opcao = 0;

        do {
            Menu.exibirMenu();
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome para adicionar: ");
                    String nomeAdd = sc.nextLine();
                    blacklist.adicionar(nomeAdd);
                    break;

                case 2:
                    System.out.print("Digite a posição que deseja alterar: ");
                    int posAlterar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o novo nome: ");
                    String novoNome = sc.nextLine();

                    blacklist.alterar(posAlterar, novoNome);
                    break;

                case 3:
                    blacklist.listar();
                    break;

                case 4:
                    System.out.print("Digite a posição para remover: ");
                    int posRemover = sc.nextInt();
                    blacklist.remover(posRemover);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}

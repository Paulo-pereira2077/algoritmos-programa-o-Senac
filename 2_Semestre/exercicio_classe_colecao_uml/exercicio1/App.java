import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaReproducao playlist = new ListaReproducao();

        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Adicionar música");
            System.out.println("2. Listar músicas");
            System.out.println("3. Tocar próxima");
            System.out.println("0. Sair");
            System.out.println("================");

            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome da música: ");
                    String nome = sc.nextLine();

                    System.out.print("Artista: ");
                    String artista = sc.nextLine();

                    System.out.print("Código do YouTube (apenas após o v=): ");
                    String codigo = sc.nextLine();

                    Musica m = new Musica(nome, artista, codigo);
                    playlist.adicionar(m);
                    break;

                case 2:
                    playlist.listar();
                    break;

                case 3:
                    playlist.tocarProxima();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

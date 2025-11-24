import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ControleReservas controle = new ControleReservas();

        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nova reserva");
            System.out.println("2. Listar reservas");
            System.out.println("3. Chamar próximo");
            System.out.println("0. Sair");
            System.out.println("================");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Nome do responsável: ");
                    String resp = sc.nextLine();

                    System.out.print("Quantidade de lugares: ");
                    int lugares = sc.nextInt();

                    controle.novaReserva(resp, lugares);
                    break;

                case 2:
                    controle.listar();
                    break;

                case 3:
                    Reserva r = controle.proximo();
                    if (r != null) {
                        System.out.println("Chamando: " + r.getResponsavel() + " - " + r.getLugares() + " lugares");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

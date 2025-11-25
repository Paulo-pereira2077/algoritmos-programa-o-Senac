import java.util.Scanner;
import modelos.*;

public class Main {

    private static Relatorio relatorio = new Relatorio(LerArquivos.listarArquivos());
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        
        System.out.println();
        System.out.println(
            "\n============================" +
            "\n        MENU PRINCIPAL" +
            "\n============================" +
            "\n1 - Listar todos os produtos" +
            "\n2 - Buscar um produto" +
            "\n3 - Comparar preços" +
            "\n4 - Sair" +
            "\n============================" +
            "\nEscolha uma opção:"
        );

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                System.out.println();
                System.out.println("======PRODUTOS======");
                System.out.println();
                relatorio.listar();
                break;

            case 2:
                System.out.println("\nDigite o nome do produto para buscar:");
                relatorio.busca(entrada.next());
                break;

            case 3:
                System.out.println("\nDigite o código do produto:");
                relatorio.CompararPreços(entrada.next());
                break;

            case 4:
                System.out.println("\nSaindo do programa...");
                System.exit(0);
                break;

            default:
                System.out.println("\nOpção inválida! Tente novamente.\n");
        }

        menu();
    }
}

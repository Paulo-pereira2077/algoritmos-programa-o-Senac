import java.util.Scanner;

public class App {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {


        GerenciadorTarefas ger = new GerenciadorTarefas();

        int opcao = 0;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Nova tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Remover tarefa");
            System.out.println("4. Alterar tarefa");
            System.out.println("5. Marcar como concluída");
            System.out.println("6. Sair");
            System.out.println("================");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Código da tarefa: ");
                    String cod = entrada.nextLine();

                    System.out.print("Descrição da tarefa: ");
                    String desc = entrada.nextLine();

                    ger.novaTarefa(new Tarefa(cod, desc));
                    break;

                case 2:
                    ger.listar();
                    break;

                case 3:
                    System.out.print("Posição da tarefa para remover: ");
                    int posR = entrada.nextInt();
                    ger.remover(posR);
                    break;

                case 4:
                    System.out.print("Posição da tarefa para alterar: ");
                    int posA = entrada.nextInt();
                    entrada.nextLine();

                    System.out.print("Novo código: ");
                    String newCod = entrada.nextLine();

                    System.out.print("Nova descrição: ");
                    String newDesc = entrada.nextLine();

                    ger.alterar(posA, newCod, newDesc);
                    break;

                case 5:
                    System.out.print("Posição da tarefa para concluir: ");
                    int posC = entrada.nextInt();
                    ger.concluir(posC);
                    break;

                case 6:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        entrada.close();
    }
}

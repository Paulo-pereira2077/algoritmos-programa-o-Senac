import java.util.Scanner;

public class exercicioMetodo4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Digite um número (ou -1 para sair):");
            num = entrada.nextInt();

            if (num == -1) {
                break;
            }

            if (isPar(num)) {
                System.out.println("Número par.");
            } else {
                System.out.println("Número ímpar.");
            }
        }

        entrada.close();
    }

    public static boolean isPar(int numero) {
        return numero % 2 == 0;
    }
}
import java.util.Scanner;

public class exercicioVetor3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] pessoas = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            pessoas[i] = entrada.next();
        }

        System.out.println("Item A - Nomes na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(pessoas[i]);
        }

        System.out.println("Item B - Primeiro e último nome:");
        System.out.println("Primeiro: " + pessoas[0]);
        System.out.println("Último: " + pessoas[4]);

        entrada.close();
    }
}
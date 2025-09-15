import java.util.Scanner;

public class normal {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 1 - Dobrar Número");

        int num;

        System.out.println("Digite um número: ");
        num = entrada.nextInt();

        double calculo;
        calculo = num * 2;

        System.out.printf("O dobro de %d é %.2f%n", num, calculo);

        entrada.close();
    }
}

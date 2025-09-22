import java.util.Scanner;

public class normal {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 10 - Números naturais");       

        int num1;
        int num2;

        System.out.println("Digite dois números: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        for (int i = num1; i >= num2; i--) {
            System.out.println(i);
        }


        entrada.close();
    }
}

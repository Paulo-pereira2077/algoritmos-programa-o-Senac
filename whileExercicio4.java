import java.util.Scanner;
public class exercicio4 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double num, conta, resultado;

        do{
            System.out.println("Digite um número: ");
            num = entrada.nextDouble();
        }

        while(num < 10 || num > 20);

        conta= num / 2;
        resultado= conta;
        System.out.println("A metade de " + num + " é " + resultado);

        entrada.close();
    }
}

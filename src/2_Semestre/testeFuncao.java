import java.util.Scanner;

public class testeFuncao {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("--------- Divisão de conta em Restaurante ---------\n");

        double conta = pedirConta("O valor da sua conta é: ");
        int pessoas = pedirPessoas("Insira o número de pessoas: ");

        double gorjeta = 5.0/100.0;

        double valorTotal = valorConta(conta, gorjeta);
        double valorIndividual = valorTotal / pessoas;

        exibir(valorTotal, valorIndividual);


        entrada.close();
    }

    public static double pedirConta(String mensagem){

        System.out.print(mensagem);
        return entrada.nextDouble();
    }

    public static int pedirPessoas(String mensagem){

        System.out.print(mensagem);
        return entrada.nextInt();
    }

    public static double valorConta(double conta, double gorjeta){

        return conta + (conta * gorjeta);

    }

    public static void exibir(double valorTotal, double valorIndividual){

        System.out.println("A conta somada com a gorjeta do garçom deu: " + valorTotal);
        System.out.println("O valor que cada um deve pagar é: " + valorIndividual);
    }

}
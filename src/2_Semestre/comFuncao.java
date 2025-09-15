import java.util.Scanner;

public class comFuncao {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 1 - Dobrar Número");

        int num = pedirNum("Digite um número");
        double calculo = calculo(num);

        exibir(num, calculo);    

        entrada.close();
    }

    public static int pedirNum(String msg){

        System.out.println(msg);
        return entrada.nextInt();
    }

    public static double calculo(int num){

        return num * 2;
    }

    public static void exibir (int num, double calculo){

        System.out.printf("O dobro de %d é %.2f%n", num, calculo);
    
    }
}

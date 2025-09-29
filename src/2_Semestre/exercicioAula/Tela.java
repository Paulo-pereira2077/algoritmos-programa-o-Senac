package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Calculando soma de um número de forma progressiva ===");    
    }

    public int pedirNumero(String msg){

        System.out.println(msg);
        return entrada.nextInt();
    }

    public void exibirResultado(int num, int numSomado){

        System.out.printf("A soma dos números de 1 á %d é %d%n", num, numSomado);
    }
    
}

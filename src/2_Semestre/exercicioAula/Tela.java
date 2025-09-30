package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Calculando soma de um número de forma progressiva ===");    
    }

    public int pedirNum(String msg){

        System.out.print(msg);
        return entrada.nextInt();
    }
    
}

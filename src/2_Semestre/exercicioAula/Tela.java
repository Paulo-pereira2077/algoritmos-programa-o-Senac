package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Exercicio 10 - Números naturais ===");
    }

    public int pedirNumeros(){

        return entrada.nextInt();
    }
    
}

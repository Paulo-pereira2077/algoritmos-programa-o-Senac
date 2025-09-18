package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Exercicio 6 - Ingresso de Cinema ===");
    }

    public String pedirIngresso(String msg){

        System.out.println(msg);
        return entrada.next();
    }

    public int pedirQtd(String msg){

        System.out.println(msg);
        return entrada.nextInt();
    }
    

    public void exibirResultado(double total){

        System.out.printf("O total a pagar é R$%.2f%n", total);
    }


}

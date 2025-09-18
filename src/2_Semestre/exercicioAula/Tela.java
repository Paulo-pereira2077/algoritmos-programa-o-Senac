package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Exercicio 5 - Dia da Semana ===");
    }

    public int pedirDia(String msg) {
        System.out.print(msg);
        return entrada.nextInt();
    }

    public void exibirDia(String dia) {
        System.out.println(dia);
    }
}

package exercicioAula5;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("------ Exercício 1 (Calculando o dobro de um número) ------");
        System.out.println();
    }

    public double pedirNumero(String mensagem) {

        System.out.println(mensagem);
        return entrada.nextDouble();
    }

    public void exibirSituacao(double resultado, double num) {

        System.out.printf("o dobro de %.2f é: %.2f\n", num, resultado);
    }

}

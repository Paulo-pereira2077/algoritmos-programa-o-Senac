package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("------ Exercicio 3 - Calcular Média ------");
        System.out.println();
    }

    public double pedirNumero(String mensagem) {

        System.out.println(mensagem);
        return entrada.nextDouble();
    }

    public void exibirSituacao(double resultado) {

        System.out.printf("A média é %.1f%n", resultado);    
    }

}

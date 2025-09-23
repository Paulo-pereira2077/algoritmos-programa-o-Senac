package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Média aluno ===");    
    }

    public double pedirNotas(String msg){

        System.out.println(msg);
        return entrada.nextDouble();
    }

    public void exibirResultado(double media, String situacao){

        System.out.printf("\nA média do aluno é %.2f%n", media);
        System.out.println("Situação: " + situacao);
    } 
    
}

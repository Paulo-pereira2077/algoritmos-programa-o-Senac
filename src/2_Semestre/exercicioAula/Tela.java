package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Calculando média do aluno ===");    
    }

    public int pedirNotas(String msg){

        System.out.print(msg);
        return entrada.nextInt();
    }
    
    public void exibirMedia(double media){

        System.out.printf("A média do aluno é %.1f%n", media);        
    }

    public void exibirSituacao(String situacao){

        System.out.println("Situacão: " + situacao);
    }

}

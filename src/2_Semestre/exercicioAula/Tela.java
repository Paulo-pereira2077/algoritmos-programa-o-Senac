package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Exercicio 7 - Média aluno ===");
    }

    public double pedirNotas(String msg){

        System.out.println(msg);
        return entrada.nextDouble();
    }

    public void exibirMedia(double calculo){
        
        System.out.printf("A média do aluno é %.2f%n", calculo);
    }
    
    public void verificarSituacao(double media){

        if (media >= 8) {
            System.out.println("Situação: Aprovado com sucesso");
        }
        else if (media >= 6 && media < 8) {
            System.out.println("Situação: Aprovado");
        }
        else if (media >= 3 && media < 6) {
            System.out.println("Situação: Recuperação");
        }
        else if (media < 3) {
            System.out.println("Situação: Reprovado");
        }
        else{
            System.out.println("Situação: Desistente");
        }
    }

}

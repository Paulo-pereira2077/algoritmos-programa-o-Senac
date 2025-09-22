package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Exercicio 9 - Situação do candidato de vestibular ===");
    }

    public double pedirNotas(String msg){
         
        System.out.println(msg);
        return entrada.nextDouble();
    }

    public void verificarSituacao(double media){
 
        if (media >= 7.0){
            System.out.println("Candidato aprovado");
        }
        else if (media < 7.0 && media >= 6){
            System.out.println("Candidato está na lista de espera");
        }
        else{
            System.out.println("Candidato não passou");
        }
    }
}

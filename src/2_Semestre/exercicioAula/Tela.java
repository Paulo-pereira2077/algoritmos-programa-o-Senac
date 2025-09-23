package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("=== Açaiteria ===");
        System.out.println();
        System.out.println("Olá, seja bem-vindo a açaiteria!");
        System.out.println("Faça o seu pedido (Açaí Pequeno = R$13,50, Açaí Médio = R$15,00, Açaí Grande = R$17,50)");
        System.out.println();
    }

    public int pedirNumeros(String msg){

        System.out.println(msg);
        return entrada.nextInt();
    }

    public void exibirPedido(Calculo calculo){

        System.out.println("Seu pedido foi registrado.");
        System.out.println();
        System.out.println("Açaí P: " + calculo.qtdP);
        System.out.println("Açaí M: " + calculo.qtdM);
        System.out.println("Açaí G: " + calculo.qtdG);
        System.out.println();
    }

    public void exibirDesconto(Calculo calculo){

        System.out.printf("Desconto de %.0f%% aplicado. %n", calculo.desconto);
    }

    public void exibirResultado(Calculo calculo){
      
        System.out.printf("Total R$ %.2f%n", calculo.total);
    }
}

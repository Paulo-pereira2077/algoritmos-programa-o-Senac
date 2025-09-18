package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("Açaiteria");
    }

    public int pedirAcai(String msg) {

        System.out.println(msg);
        return entrada.nextInt();
    }

    public void exibirQuantidadeAcai(Acaiteria acai) {
        
        System.out.println("Seu pedido foi registrado.");
        System.out.println();
        System.out.println("Açaí P: " + acai.qtdP);
        System.out.println("Açaí M: " + acai.qtdM);
        System.out.println("Açaí G: " + acai.qtdG);
    }

    public void descontoAplicado(Acaiteria acai) {
        System.out.printf("Desconto de %d%% aplicado.%n", acai.desconto); // corrigido o símbolo de porcentagem
    }
}

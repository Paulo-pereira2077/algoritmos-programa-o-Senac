package terceiro_Semestre.exercicio_para_praticar;

import java.util.Scanner;

public class Tela {

    static Scanner entrada = new Scanner(System.in);

    public void titulo() {
        System.out.println("Exercício 1");
    }

    public double pedirNotas(String msg) {
        System.out.println(msg);
        return entrada.nextDouble();
    }

    public void resultado(double resultado) {
        System.out.printf("A média é %.2f%n", resultado);
    }
}

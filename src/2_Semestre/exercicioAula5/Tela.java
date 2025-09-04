package exercicioAula5;
import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner (System.in);

public void apresentacao(){
    System.out.println("------ Exercício 3 (Calculando média do aluno ------");
    System.out.println();
}

public double pedirNotas(String mensagem){

    System.out.println(mensagem);
    return entrada.nextDouble();
}

public void exibirSituacao(double calculoMedia){

    System.out.println("A média é: " + calculoMedia);
    System.out.println(calculoMedia);
}

}

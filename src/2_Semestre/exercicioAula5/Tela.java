package exercicioAula5;
import java.util.Scanner;
 
public class Tela {
    Scanner entrada = new Scanner (System.in);

    public void apresentacao(){
        System.out.println("------ Exercício 2 (Calculando a soma de um número) ------");
        System.out.println();
    }


    public int pedirNumero(String msg){

        System.out.println(msg);
        return entrada.nextInt();
    }

    public void exibir(int num1, int num2, int resultado){

        System.out.printf("A soma de %d + %d é %d %n", num1, num2, resultado);
    }

}

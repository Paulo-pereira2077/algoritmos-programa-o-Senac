import java.util.Scanner;
public class forExercicio1 {
public static void main (String [] args){
    Scanner entrada = new Scanner(System.in);
    int numero;

    for (numero = 100; numero >= 1; numero--){
        System.out.println(numero + "");
    }
    entrada.close();
}
}
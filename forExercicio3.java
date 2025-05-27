import java.util.Scanner;
public class forExercicio3 {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        int numero, sequencia;
        
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        for (sequencia = 1; sequencia <= numero; sequencia++){
            System.out.print(sequencia + " ");
          }

          entrada.close();   
    }
}

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();
        
        int contador = 1; 
        
        while (contador <= num) {
            System.out.print(contador + " "); 
            contador *= 2;
        }

        entrada.close();
    }
}

import java.util.Scanner;
 
public class comFuncao {
    
    static Scanner entrada = new Scanner(System.in);
 
    public static void main(String[] args) {

        System.out.println("Exercicio 10 - Números naturais");       
        
        System.out.println("Digite dois números: ");
        int num1 = pedirNumeros();
        int num2 = pedirNumeros();

        contagem(num1, num2);

        entrada.close();
    }

    public static int pedirNumeros(){

        return entrada.nextInt();
    }

    public static void contagem(int num1, int num2){

        for (int i = num1; i >= num2; i--) {
            System.out.println(i);
        }
    }
}
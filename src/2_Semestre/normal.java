import java.util.Scanner;

public class normal {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        int quantidade;
        String tipoIngresso;
        double valorIngresso = 28.5;

        System.out.println("==== Cinema ====");
        System.out.println();// pula uma linha

        System.out.println("Digite a quantidade de ingressos: ");
        quantidade = entrada.nextInt();

        System.out.println("Digite o tipo do ingrsso (Inteira ou meia): ");
        tipoIngresso = entrada.next();

        double valor;
        if (tipoIngresso.equalsIgnoreCase("Inteira")){            
            valor = valorIngresso * quantidade;
            System.out.println("Valor total: " + valor);
        }
        else if (tipoIngresso.equalsIgnoreCase("Meia")){
            valor = (valorIngresso / 2) * quantidade;
            System.out.println("Valor total: " + valor);
        }
        else {
            System.out.println("Esse tipo não existente");
        }

        entrada.close();
    }
}

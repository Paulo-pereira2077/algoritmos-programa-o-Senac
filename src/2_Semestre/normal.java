import java.util.Scanner;

public class normal {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 6 - Ingresso de Cinema");       
                      
       int qtdIngresso;
       String tipoIngresso;

       System.out.println("Bem-vindo ao cinema");
       System.out.print("Digite o tipo do ingresso (Meia ou inteira): ");
       tipoIngresso = entrada.next();

       System.out.println("Digite a quantidade de ingressos: ");
        qtdIngresso = entrada.nextInt();

        double valor=0;

        if (tipoIngresso.equalsIgnoreCase("Meia")){

            valor = qtdIngresso * 14.25;
        }
        else if (tipoIngresso.equalsIgnoreCase("Inteira")){
            valor = qtdIngresso * 28.5;
        }
        else{
            System.out.println("Tipo de ingresso inválido!");
        }

        System.out.printf("O total a pagar é R$%.2f%n", valor);

        entrada.close();
    }
}

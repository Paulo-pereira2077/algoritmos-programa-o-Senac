import java.util.Scanner;

public class comFuncao {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

       System.out.println("Exercicio 6 - Ingresso de Cinema");      

       System.out.println("Bem-vindo ao cinema");

       String tipoIngresso= pedirIngresso("Digite o tipo do ingresso (Meia ou inteira): ");      

       int qtdIngresso = pedirQtd("Digite a quantidade de ingressos: ");
        
     
        double total = verificarSituacao(qtdIngresso, tipoIngresso);

        exibirResultado(total);

        entrada.close();
    }

    public static String pedirIngresso(String msg){

        System.out.println(msg);
        return entrada.next();
    }

    public static int pedirQtd(String msg){

        System.out.println(msg);
        return entrada.nextInt();
    }

        public static double verificarSituacao(int qtdIngresso, String tipoIngresso){

        if (tipoIngresso.equalsIgnoreCase("Meia")){

            return calcularMeia(qtdIngresso);
        }
        else if (tipoIngresso.equalsIgnoreCase("Inteira")){
            return calcularInteira(qtdIngresso);
        }
        else{
            System.out.println("Tipo de ingresso inválido!");
            return 0.0;
        }
    }

    public static double calcularMeia(int qtdIngresso){

        double calculoM = qtdIngresso * 14.25;
        return calculoM;
    }

    public static double calcularInteira(int qtdIngresso){

        double calculoI = qtdIngresso * 28.5;
        return calculoI;
    }

    public static void exibirResultado(double total){

        System.out.printf("O total a pagar é R$%.2f%n", total);
    }
}

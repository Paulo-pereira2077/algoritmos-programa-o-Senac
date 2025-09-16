import java.util.Scanner;

public class normal {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 5 - Dia da semana");       
                      
       System.out.println("Digite um número de 0 a 6 para saber o dia da semana");
       int num = entrada.nextInt();

       switch(num){
        case 0:
            System.out.println("Domingo");
        break;

        case 1:
            System.out.println("Segunda-feira");
        break;
        
        case 2:
            System.out.println("Terça-feira");
        break;
        
        case 3:
            System.out.println("Quarta-feira");
        break;
        
        case 4:
            System.out.println("Quinta-feira");
        break;
        
        case 5:
            System.out.println("Sexta-feira");
        break;
        
        case 6:
            System.out.println("Sábado");
        break;

        default:
            System.out.println("Dia da semana inválido");
        
       }

        entrada.close();
    }
}

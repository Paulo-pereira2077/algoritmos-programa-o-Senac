import java.util.Scanner;

public class normal {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 3 - Calcular Média");

        double nota1;
        double nota2;
        double nota3;

        System.out.println("Digite suas notas: ");
        nota1 = entrada.nextDouble(); 
        nota2 = entrada.nextDouble(); 
        nota3 = entrada.nextDouble(); 

        double media;
        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média é %.1f%n", media);

        entrada.close();
    }
}

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int contador = 1; 

        while (contador <= 5) { 
            double nota1, nota2, mediaAritmetica;

            System.out.println("Aluno " + contador + ":");
            
            
            do {
                System.out.print("Digite sua primeira nota (0 a 10): ");
                nota1 = entrada.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota1 < 0 || nota1 > 10);

            
            do {
                System.out.print("Digite sua segunda nota (0 a 10): ");
                nota2 = entrada.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! Digite um valor entre 0 e 10.");
                }
            } while (nota2 < 0 || nota2 > 10);

            
            mediaAritmetica = (nota1 + nota2) / 2;

            
            System.out.println("A média do aluno " + contador + " é: " + mediaAritmetica);

            contador++;
        }

        entrada.close();
    }
}

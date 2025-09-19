import java.util.Scanner;

public class normal {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 7 - Média do aluno");       
                      
        double nota1;
        double nota2;
        double nota3;

        System.out.println("Digite as suas notas: ");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();

        double media;
        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do aluno é %.2f%n", media);
        
        if (media >= 8) {
            System.out.println("Situação: Aprovado com sucesso");
        }
        else if (media >= 6 && media < 8) {
            System.out.println("Situação: Aprovado");
        }
        else if (media >= 3 && media < 6) {
            System.out.println("Situação: Recuperação");
        }
        else if (media < 3) {
            System.out.println("Situação: Reprovado");
        }
        else{
            System.out.println("Situação: Desistente");
        }       
       
        entrada.close();
    }
}

import java.util.Scanner;

public class comFuncao {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 7 - Média do aluno");                          
        
        double nota1 = pedirNotas("Digite as suas notas: ");
        double nota2 = pedirNotas("Digite as suas notas: ");
        double nota3 = pedirNotas("Digite as suas notas: ");

        double media = calcularMedia(nota1, nota2, nota3);

        System.out.printf("A média do aluno é %.2f%n", media); 
        
        verificarSituacao(media);
       
       
        entrada.close();
    }

    public static double pedirNotas(String msg){

        System.out.println(msg);
        return entrada.nextDouble();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3){

        return (nota1 + nota2 + nota3) / 3;
    }

    public static void verificarSituacao(double media){

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
    }
}

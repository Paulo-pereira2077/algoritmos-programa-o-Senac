import java.util.Scanner;

public class comFuncao {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 3 - Calcular Média");

        double nota1 = pedirNotas("Digite sua nota: ");
        double nota2 = pedirNotas("Digite sua nota: ");
        double nota3 = pedirNotas("Digite sua nota: ");
        
        double media =calcularMedia(nota1, nota2, nota3);
        
        exibirSituacao(media);

        entrada.close();
    }

    public static double pedirNotas(String msg){

        System.out.print(msg);
        return entrada.nextDouble();
    }

    public static double calcularMedia(double nota1, double nota2, double nota3){
        
        return (nota1 + nota2 + nota3) / 3;
    }

    public static void exibirSituacao(double media){

        System.out.printf("A média é %.1f%n", media);
    }

}

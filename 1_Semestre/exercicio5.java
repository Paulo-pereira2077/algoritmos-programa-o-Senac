import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1, numero2, resultado;
        char operacao;

        System.out.print("Digite o primeiro número: ");
        numero1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero2 = entrada.nextDouble();

        System.out.println("Digite a operação: ");
        System.out.println("M - Média entre os números");
        System.out.println("S - Diferença do maior pelo menor");
        System.out.println("P - Produto entre os números");
        System.out.println("D - Divisão do primeiro pelo segundo");
        operacao = entrada.next().toUpperCase().charAt(0); // Convertendo para maiúscula

        switch (operacao) {
            case 'M': 
                resultado = (numero1 + numero2) / 2.0;
                System.out.println("A média é: " + resultado);
                break;

            case 'S': 
                resultado = Math.abs(numero1 - numero2); // Usa valor absoluto para garantir resultado correto
                System.out.println("A diferença entre os números é: " + resultado);
                break;

            case 'P': 
                resultado = numero1 * numero2;
                System.out.println("O produto é: " + resultado);
                break;

            case 'D': 
                if (numero2 == 0) {
                    System.out.println("Erro! Não é possível dividir por zero.");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println("O resultado da divisão é: " + resultado);
                }
                break;

            default:
                System.out.println("Operação inválida!");
        }

        entrada.close();
    }
}
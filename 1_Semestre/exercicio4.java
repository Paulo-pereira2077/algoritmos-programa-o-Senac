import java.util.Scanner;

public class exercicio4{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double salario;
        double bonus;
        double novoSalario;

        System.out.println("Digite o seu salário: ");
        salario = entrada.nextDouble();

        System.err.println("Digite seu plano (A, B, C): ");
        char plano= entrada.next().charAt(0);    

        switch(plano){
            case 'A':
            bonus = salario * 0.10;
            break;

            case 'B':
            bonus = salario * 0.15;
            break;

            case 'C':
            bonus = salario * 0.20;
            break;

            default:
            System.out.println("Plano inválido ");
            entrada.close();
            return;
        }

        novoSalario = salario + bonus;
            System.out.println("Seu aumento foi de: " + bonus);
            System.out.println("Seu salário agora é: " + novoSalario);

        entrada.close();

    }
}
import java.util.Scanner;
public class exercicio9 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double salario;
        double prestacao;

        System.out.println("Digite o seu salário: ");
        salario = entrada.nextDouble();
        System.out.println(("Digite o valor da prestação: "));
        prestacao = entrada.nextDouble();

        if(prestacao > salario * 0.30){
            System.out.println("O empréstimo não pode ser concedido ");
        }
        else{
            System.out.println("O empréstimo pode ser concedido ");
        }
        entrada.close();
    }
}

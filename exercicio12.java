import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] srgs){
        Scanner entrada = new Scanner(System.in);
        double salario;
        double conta1;
        double conta2;
        double conta3;

        System.out.println("Digite seu salário: ");
        salario = entrada.nextDouble();

        if(salario <= 600){
            System.out.println("Você está isento");
        }
        else{
            if(salario > 600 && salario <= 1200){
               conta1= salario - (salario * 0.20);
                System.out.println("Seu valor agora é: R$" + conta1); 
            }
            if(salario > 1200 && salario <= 2000){
                conta2= salario - (salario * 0.25);
                 System.out.println("Seu valor agora é: R$" + conta2); 
            }
            if(salario >= 2000){
                conta3= salario - (salario * 0.30);
                 System.out.println("Seu valor agora é: R$" + conta3); 
             }
        }
        entrada.close();
    }
}

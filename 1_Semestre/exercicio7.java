import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double salario;
        double ano;
        double salario_novo;
        
        System.out.println("Digite seu tempo na empresa ");
            ano= entrada.nextDouble();
        System.out.println("Digite o salário ");
            salario= entrada.nextDouble();

        double bonus;
                
        if(ano >= 5){
            bonus = salario * 0.20;
            salario_novo = salario + bonus;
            System.out.println("O bônus é: R$ " + bonus);
            System.out.println("O seu novo salário é: R$ " + salario_novo);
        }
        else{
            bonus = salario * 0.10;
            salario_novo = salario + bonus;
            System.out.println("O bônus é: R$ " + bonus);
            System.out.println("O seu novo salário é: R$ " + salario_novo);
        }
        
        entrada.close();
    }
}

import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System. in);
        int idade;
        System.out.println("Digite a idade ");
        idade = entrada.nextInt();
                
        if(idade >= 18){
            System.out.println("Maior de idade " + idade);
        }
        else{
            System.out.println("Menor de idade " + idade);
        }
        entrada.close();

    }
}

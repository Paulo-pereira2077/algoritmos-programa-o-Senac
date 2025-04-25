import java.util.Scanner;
public class exercicio10 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        
        System.out.println("Digite o primeiro número:");
            numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número:");
            numero2 = entrada.nextInt();
        System.out.println("Digite o terceiro número:");
            numero3 = entrada.nextInt();

    if(numero1 == numero2 && numero2 == numero3){
        System.out.println("Os números são iguais");
    }
    else{
        int maior = numero1;
        
        if(numero2 > maior){
            maior= numero2;        
        }
        if(numero3 > maior){
            maior = numero3;
        }
        System.out.println("O maior número é: " + maior);
    }

        entrada.close();
    }
}

import java.util.Scanner;
public class exercicio3 {
    public static void main(String [] args){
        Scanner entrada =new Scanner(System.in);
        int numero1;
        int numero2;
        int diferenca; 
        
        System.out.println("Digite o primeiro número ");
            numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número ");
            numero2 = entrada.nextInt();
        if(numero1 == numero2){
            System.out.println("Número iguais ");
        }
        else{
            if(numero1 > numero2){
                diferenca= numero1 - numero2;
                System.out.println("O resultado é " + diferenca);
            }
            else{
                diferenca= numero2 - numero1;
                System.out.println("O resultado é " + diferenca);
            }
        }
        entrada.close();
    }
}

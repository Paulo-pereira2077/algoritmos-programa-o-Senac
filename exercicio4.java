import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        
        System.out.println("Digite o primeiro número ");
            numero1= entrada.nextDouble();
        System.out.println("Digite o segundo número ");
            numero2= entrada.nextDouble();
            
        if(numero1 == numero2){
        System.out.println("Os números são iguais ");
    }
        else if(numero1 > numero2){
            System.out.println(numero1 + "=>" + numero2);
        }
        else{
            System.out.println(numero2 + "=>" + numero1);
        }

        entrada.close();    
    }
}


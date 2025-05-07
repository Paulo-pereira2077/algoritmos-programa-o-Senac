import java.util.Scanner;
public class exercicio2{
    public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);
        int num, contador;
        contador = 0;
        
        while(contador < 10){
          
        System.out.println("Digite um número: " + (contador + 1));
            num= entrada.nextInt();
        
         if(num % 2 == 0){ 
            System.out.println("O número " + num + " é par");
          }
         else {
            System.out.println("O número " + num + " é ímpar");
          }

          contador++;

        }

        entrada.close();
    }
}
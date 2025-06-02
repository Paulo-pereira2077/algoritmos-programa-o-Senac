import java.util.Scanner;
public class exercicio6 {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);
        int num, menorNum = 0, contador = 0;
         
        
        while(contador < 10){
            System.out.println("Digite o " + contador + " ");
            num= entrada.nextInt();
            
        if(contador == 0){
            menorNum= num;
        }
        else if (num < menorNum) {
            menorNum = num;
        }
        
        contador++;    
       
    }

    System.out.println("O menor número é " + menorNum);
    entrada.close();
  }

}
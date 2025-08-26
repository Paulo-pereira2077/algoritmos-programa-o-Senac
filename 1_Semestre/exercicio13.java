import java.util.Scanner;
public class exercicio13 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado;
        
        System.out.println("Digite o primeiro número: ");
            numero1 = entrada.nextDouble();
        
        System.out.println("Digite o sinal da operção(+, -, *, /): ");
            char operacao = entrada.next().charAt(0);
        
        System.out.println("Digite o segundo número: ");
            numero2 = entrada.nextDouble();
        
        if(operacao == '+'){
            resultado = numero1 + numero2;
            System.out.println("Resultado é: " + resultado);
        }
        else if (operacao == '-'){
            resultado= numero1 - numero2;
            System.out.println("Resultado é: " + resultado);
        }
        else if(operacao == '*'){
            resultado= numero1 * numero2;
            System.out.println("Resultado é: " + resultado);      
        }
        else if(operacao == '/'){
            resultado= numero1 / numero2;
            System.out.println("Resultado é: " + resultado);
        }
        else{
            System.out.println("Impossível dividir!!");
              
            System.out.println("Sinal inválido");
        }
         entrada.close();       
    }
   
}


import java.util.Scanner;
public class exercicio1{
    public static void main(String[] args){
        System.out.println("Digite o número ");
            Scanner entrada = new Scanner(System.in);
            double numero, diferenca;
            numero = entrada.nextDouble();
            
            if(numero > 20){
                diferenca = numero/2.0;
                System.out.println("Exibir resultado " + diferenca);
                entrada.close();                
            }
    }
}

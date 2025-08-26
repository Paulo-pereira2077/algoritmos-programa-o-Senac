import java.util.Scanner;

public class whileExercicio7 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double altura, peso, calculo, imc;
        int contador = 0;

        do{
            System.out.println("Digite sua altura: ");
            altura = entrada.nextDouble();
            System.out.println("Digite o seu peso: ");
            peso = entrada.nextDouble();

            calculo = peso / (altura * altura);
            System.out.println("Seu imc é igual a: " + calculo);
            
            contador++;
        }

        while(contador < 10);
        imc = calculo;
        if (imc == 18.5 && imc == 24.9){
            System.out.println("Seus organismo é saudável " + imc);
        }   
        else{
            System.out.println("Você está propício à obesidade ");
        }
entrada.close();

        
    }
}
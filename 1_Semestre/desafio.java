import java.util.Scanner;
public class desafio {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        
        System.out.println("Você é cidadão nato no Brasil? (true para sim, false para não): ");
            boolean cidadao= entrada.nextBoolean();
        System.out.println("Digite sua idade: ");
            idade= entrada.nextInt();
        System.out.println("Possui título de eleitor? (true para sim, false para não): ");
            boolean tituloEleitor= entrada.nextBoolean();
        
        if (!cidadao){
            System.out.println("Você não está apto a votar!" );
        }    
        else if(idade < 16){
            System.out.println("Você não está apto a votar!! ");
        }
        else if((idade >=16 && idade < 18)|| idade > 70 || !tituloEleitor){
            System.out.println("Seu voto é facultativo. ");
        }
        else{
            System.out.println("Você está apto a votar. ");
        }

        entrada.close();
            
    }   
}

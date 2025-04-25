import java.util.Scanner;
public class exercicio11 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite a sua idade: ");
        idade = entrada.nextInt();
        
        if(idade >= 5 && idade <=7){
            System.out.println("Sua categoria é: intantil A");
        }
        else{
            if(idade >=8 && idade <=10){
                System.out.println("Sua categoria é: intantil B");
            }
            if(idade >=11 && idade <=13){
                System.out.println("Sua categoria é: Juvenil A");
            }
            if(idade >=14 && idade <=17){
                System.out.println("Sua categoria é: juvenil B");
            }
            if(idade >=18){
                System.out.println("Sua categoria é: Sênior");
            }
            if(idade < 5){
                System.out.println("Você não pertence a nenhuma categoria");
            }
        }

        entrada.close();
    }
}

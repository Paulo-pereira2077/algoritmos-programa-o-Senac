package exercicioAula;

import java.util.Scanner;

public class Tela {
    Scanner entrada = new Scanner(System.in);

    public void apresentacao() {
        System.out.println("Exercicio 5 - Dia da semana"); 
    }                   
     
    public int pedirDia(String msg){

        System.out.println(msg);
        return entrada.nextInt();
    }

    public void diaSemana(int num){
        switch(num){
        case 0:
            System.out.println("Domingo");
        break;

        case 1:
            System.out.println("Segunda-feira");
        break;
        
        case 2:
            System.out.println("Terça-feira");
        break;
        
        case 3:
            System.out.println("Quarta-feira");
        break;
        
        case 4:
            System.out.println("Quinta-feira");
        break;
        
        case 5:
            System.out.println("Sexta-feira");
        break;
        
        case 6:
            System.out.println("Sábado");
        break;

        default:
            System.out.println("Dia da semana inválido");
    }
  }
}

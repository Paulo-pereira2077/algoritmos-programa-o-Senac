import java.util.Scanner;
public class exercicio6 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        char sexo;
        double altura;
        double peso;
        double pesoIdeal;
                
        System.out.println("Digite o seu sexo (Masculino (M) / Feminino (F)): ");
            sexo= entrada.next().charAt(0);
        System.out.println("Digite o seu peso: ");
            peso= entrada.nextDouble();
        System.out.println("Digite sua altura (m): ");
            altura= entrada.nextDouble();
            
        if(sexo == 'M') {
            pesoIdeal= ( peso / (altura*altura));
            System.out.println("O peso ideal é: " + pesoIdeal);
        }
        else if(sexo == 'F'){
            pesoIdeal= (peso / (altura*altura));
            System.out.println("O peso ideal é: " + pesoIdeal);
        }

        entrada.close();
    }
}

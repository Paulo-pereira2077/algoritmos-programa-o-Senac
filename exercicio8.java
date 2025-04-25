import java.util.Scanner;
public class exercicio8 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String senhaCorreta = "R10p5";

        System.out.println("Digite a senha: ");
        String senha = entrada.nextLine();

        if(senha.equals(senhaCorreta)){
            System.out.println("Acesso concedido ");            
        }
        else{
            System.out.println("Acesso negado ");
        }
        entrada.close();
    }
    
}

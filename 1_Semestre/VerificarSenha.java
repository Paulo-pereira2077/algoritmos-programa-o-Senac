import java.util.Scanner;

public class VerificarSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha = "polhinho";
        String senhaErrada;

        //Solicita a senha
        do {
            System.out.println("Digite a senha: ");
            senhaErrada = entrada.nextLine();

            if (!senhaErrada.equals(senha)) {
                System.out.println("Senha incorreta!!");
            }
        }
        while (!senhaErrada.equals(senha)); // vai continuar até acertar a senha

        System.out.println("Acesso permitido!");
        entrada.close();
    }
}
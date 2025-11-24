import java.util.Scanner;

public class App {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("\nDigite o código do curso\nTSI (Sistemas para Internet),\nTADS (Análise e Desenvolvimento de Sistemas),\nBCC (Ciência da Computação),\nBSI (Sistemas de Informação),\nBEC (Engenharia da Computação) \nDigite aqui: ");
        String codCurso = entrada.nextLine();

        System.out.println();
        System.out.print("Digite o código da bolsa\nMON (Monitoria),\nEMP (Ensino Médio Público),\nISE (Isenção),\nEXT (Projeto de Extensão),\nPES (Pesquisa Científica)\nOu deixe vazio: ");
        String codBolsa = entrada.nextLine();

        Opcoes op = new Opcoes(codCurso, codBolsa);
        Universidade uni = new Universidade();

        Resultado res = uni.calcularMensalidade(op);

        if (res == null) return;

        System.out.println("\n===== RESULTADO =====");
        System.out.println("Curso: " + res.lerCurso());
        System.out.println("Bolsa: " + res.lerBolsa());
        System.out.println("Desconto: R$ " + res.lerDesconto());
        System.out.println("Mensalidade Final: R$ " + res.lerMensalidade());
    }
}

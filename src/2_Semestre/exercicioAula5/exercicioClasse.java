package exercicioAula5;

public class exercicioClasse {

    public static void main(String[] args) {

        Tela tela = new Tela();
        Calculo calculo = new Calculo();
        Numero numero = new Numero();

        // exibe a logo do programa
        tela.apresentacao();

        // recebe as notaas
        numero.num = tela.pedirNumero("Digite um número: ");

        double resultado = calculo.dobrarNumero(numero.num);

        tela.exibirSituacao(resultado, numero.num);

    }

}
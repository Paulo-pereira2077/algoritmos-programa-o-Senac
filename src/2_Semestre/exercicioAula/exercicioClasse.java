package exercicioAula;

public class exercicioClasse {
    public static void main(String[] args) {
       
        Tela tela = new Tela();
        Calculo calculo = new Calculo();

        tela.apresentacao();

        String tipoIngresso = tela.pedirIngresso("Digite o tipo do ingresso (Meia ou inteira): ");
        int qtdIngresso = tela.pedirQtd("Digite a quantidade de ingressos: ");

       double total = calculo.verificarSituacao(qtdIngresso, tipoIngresso);

        tela.exibirResultado(total);

    }
}

package exercicioAula;

public class exercicioClasse {
    public static void main(String[] args) {
       
        Tela tela = new Tela();
        Calculo calculo = new Calculo();

        tela.apresentacao();

         calculo.tipoIngresso = tela.pedirIngresso("Digite o tipo do ingresso (Meia ou inteira): ");
         calculo.qtdIngresso = tela.pedirQtd("Digite a quantidade de ingressos: ");

       double total = calculo.verificarSituacao(calculo.qtdIngresso, calculo.tipoIngresso);

        tela.exibirResultado(total);

    }
}

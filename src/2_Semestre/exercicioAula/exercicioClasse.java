package exercicioAula;

public class exercicioClasse {

    public static void main(String[] args) {

        Tela tela = new Tela();
        Acaiteria acaiteria = new Acaiteria();

        tela.apresentacao();

        acaiteria.qtdP = tela.pedirAcai("Digite a quantidade de açaí P: ");
        acaiteria.qtdM = tela.pedirAcai("Digite a quantidade de açaí M: ");
        acaiteria.qtdG = tela.pedirAcai("Digite a quantidade de açaí G: ");
        acaiteria.desconto = tela.pedirAcai("Digite o valor do cupom de desconto (%): ");

        tela.exibirQuantidadeAcai(acaiteria);
        tela.descontoAplicado(acaiteria);

        acaiteria.verficarPagamento();
    }
}

package exercicioAula;

public class exercicioClasse {
    public static void main(String[] args) {

        Tela tela = new Tela();
        Calculo calculo = new Calculo();

        tela.apresentacao();

        calculo.qtdP = tela.pedirNumeros("Digite a quantidade de P: ");
        calculo.qtdM = tela.pedirNumeros("Digite a quantidade de M: ");
        calculo.qtdG = tela.pedirNumeros("Digite a quantidade de G: ");
        calculo.desconto = tela.pedirNumeros("Digite o valor do cupom de desconto: "); 

        tela.exibirPedido(calculo);
        tela.exibirDesconto(calculo);

        calculo.lerDesconto();
        calculo.totalPagar();

        tela.exibirResultado(calculo);
    }    
}

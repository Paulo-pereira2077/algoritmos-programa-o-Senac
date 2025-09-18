package exercicioAula;

public class exercicioClasse {
    public static void main(String[] args) {
        Tela tela = new Tela();
        Dia diaSemana = new Dia();

        tela.apresentacao();

        diaSemana.num = tela.pedirDia("Digite um número de 0 a 6: ");
        diaSemana.lerDia();        

        tela.exibirDia(diaSemana.dia);
    }
}

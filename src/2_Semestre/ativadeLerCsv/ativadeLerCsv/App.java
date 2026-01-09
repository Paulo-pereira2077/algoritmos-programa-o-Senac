public class App {

    public static void main(String[] args) {

        GerenciadorDistribuicao gerenciador = new GerenciadorDistribuicao();

        gerenciador.lerInscricoes("arquivos/Inscricoes.csv");
        gerenciador.lerSalas("arquivos/Salas.csv");
        gerenciador.lerIntervalos("arquivos/Intervalos.csv");

        gerenciador.atribuirHorarios();
        gerenciador.distribuir();

        gerenciador.gerarCSV("DistribuicaoFinal.csv");
    }
}

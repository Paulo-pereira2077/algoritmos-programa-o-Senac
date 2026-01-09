import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Candidato> candidatos =
                LeitorCSV.lerCandidatos("arquivos/Inscricoes.csv");

        ArrayList<Sala> salas =
                LeitorCSV.lerSalas("arquivos/Sala.csv");

        ArrayList<IntervaloHorario> intervalos =
                LeitorCSV.lerIntervalos("arquivos/Intervalos.csv");

        Distribuidor.distribuir(
                candidatos,
                salas,
                intervalos,
                "ResultadoAlocacao.csv"
        );

        System.out.println("Arquivo gerado com sucesso!");
    }
}

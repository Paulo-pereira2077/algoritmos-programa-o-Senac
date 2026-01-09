import java.io.FileWriter;
import java.util.ArrayList;

public class Distribuidor {

    private static String encontrarHorario(int cod, ArrayList<IntervaloHorario> intervalos) {
        for (IntervaloHorario i : intervalos) {
            if (i.contem(cod)) return i.getHorario();
        }
        return null;
    }

    public static void distribuir(
            ArrayList<Candidato> candidatos,
            ArrayList<Sala> salas,
            ArrayList<IntervaloHorario> intervalos,
            String arquivoSaida
    ) {
        try (FileWriter fw = new FileWriter(arquivoSaida)) {

            fw.write("horario_prova,numero_sala,cod_inscricao,nome_candidato,tipo_prova\n");

            for (Candidato c : candidatos) {

                String horario = encontrarHorario(c.getCodInscricao(), intervalos);

                for (Sala s : salas) {

                    if (s.getHorario().equals(horario)
                            && s.aceitaTipoProva(c.getTipoProva())
                            && s.temVaga()) {

                        s.adicionarCandidato();

                        fw.write(horario + "," +
                                s.getNumeroSala() + "," +
                                c.getCodInscricao() + "," +
                                c.getNome() + "," +
                                c.getTipoProva() + "\n");

                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

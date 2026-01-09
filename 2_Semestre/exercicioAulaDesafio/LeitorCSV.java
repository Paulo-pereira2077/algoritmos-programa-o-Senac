import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class LeitorCSV {

    public static ArrayList<Candidato> lerCandidatos(String caminho) {
        ArrayList<Candidato> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                int cod = Integer.parseInt(dados[0].trim());
                String nome = dados[1].trim();
                String prova = dados[2].trim();
                lista.add(new Candidato(cod, nome, prova));
            }
        } catch (Exception e) {}
        return lista;
    }

    public static ArrayList<Sala> lerSalas(String caminho) {
        ArrayList<Sala> salas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] d = linha.split(",");
                int id = Integer.parseInt(d[0].trim());
                String numero = d[1].trim();
                int capacidade = Integer.parseInt(d[2].trim());
                String horario = d[3].trim();

                String[] tipos = d[4].split("\\|");
                ArrayList<String> provas = new ArrayList<>();

                for (String t : tipos) provas.add(t.trim());

                salas.add(new Sala(id, numero, capacidade, horario, provas));
            }
        } catch (Exception e) {}
        return salas;
    }

    public static ArrayList<IntervaloHorario> lerIntervalos(String caminho) {
        ArrayList<IntervaloHorario> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha;
            while ((linha = br.readLine()) != null) {
                String[] d = linha.split(",");
                int inicio = Integer.parseInt(d[0].trim());
                int fim = Integer.parseInt(d[1].trim());
                String horario = d[2].trim();

                lista.add(new IntervaloHorario(inicio, fim, horario));
            }
        } catch (Exception e) {}
        return lista;
    }
}

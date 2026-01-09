import java.io.*;
import java.util.ArrayList;

public class GerenciadorDistribuicao {

    public ArrayList<Inscricao> inscricoes = new ArrayList<>();
    public ArrayList<Sala> salas = new ArrayList<>();
    public ArrayList<Intervalo> intervalos = new ArrayList<>();

    public void lerInscricoes(String caminho) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            String linha;
            br.readLine(); 

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                int cod = Integer.parseInt(partes[0].trim());
                String nome = partes[1].trim();
                String prova = partes[2].trim();

                inscricoes.add(new Inscricao(cod, nome, prova));
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler inscrições: " + e.getMessage());
        }
    }

    public void lerSalas(String caminho) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            String linha;
            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");

                int id = Integer.parseInt(partes[0].trim());
                String numero = partes[1].trim();
                int capacidade = Integer.parseInt(partes[2].trim());
                String horario = partes[3].trim();

                String[] provas = partes[4].split("\\|");
                ArrayList<String> listaProvas = new ArrayList<>();
                for (String p : provas) listaProvas.add(p.trim());

                salas.add(new Sala(id, numero, capacidade, horario, listaProvas));
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler salas: " + e.getMessage());
        }
    }

    public void lerIntervalos(String caminho) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(caminho));
            String linha;
            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                int inicio = Integer.parseInt(partes[0].trim());
                int fim = Integer.parseInt(partes[1].trim());
                String horario = partes[2].trim();

                intervalos.add(new Intervalo(inicio, fim, horario));
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler intervalos: " + e.getMessage());
        }
    }

    public void atribuirHorarios() {
        for (Inscricao ins : inscricoes) {
            for (Intervalo inter : intervalos) {
                if (inter.contem(ins.codigo)) {
                    ins.horarioProva = inter.horario;
                }
            }
        }
    }

    public void distribuir() {
        for (Inscricao ins : inscricoes) {

            Sala melhorSala = null;

            for (Sala sala : salas) {
                if (sala.horarioProva.equals(ins.horarioProva)
                        && sala.aceitaProva(ins.tipoProva)
                        && sala.temVaga()) {

                    boolean mesmaProvaNaSala = sala.alocados.stream()
                            .anyMatch(i -> i.tipoProva.equals(ins.tipoProva));

                    if (mesmaProvaNaSala) {
                        melhorSala = sala;
                        break;
                    }
                }
            }

            if (melhorSala == null) {
                for (Sala sala : salas) {
                    if (sala.horarioProva.equals(ins.horarioProva)
                            && sala.aceitaProva(ins.tipoProva)
                            && sala.temVaga()
                            && sala.alocados.isEmpty()) {
                        melhorSala = sala;
                        break;
                    }
                }
            }

            if (melhorSala == null) {
                for (Sala sala : salas) {
                    if (sala.horarioProva.equals(ins.horarioProva)
                            && sala.aceitaProva(ins.tipoProva)
                            && sala.temVaga()) {
                        melhorSala = sala;
                        break;
                    }
                }
            }

            if (melhorSala != null) {
                melhorSala.alocados.add(ins);
            }
        }
    }

    public void gerarCSV(String caminho) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(caminho));
            bw.write("horario_prova,numero_sala,cod_inscricao,nome_candidato,tipo_prova\n");

            for (Sala sala : salas) {
                for (Inscricao ins : sala.alocados) {
                    bw.write(
                        sala.horarioProva + "," +
                        sala.numeroSala + "," +
                        ins.codigo + "," +
                        ins.nome + "," +
                        ins.tipoProva + "\n"
                    );
                }
            }

            bw.close();
            System.out.println("Arquivo gerado em: " + caminho);
        } catch (Exception e) {
            System.out.println("Erro ao gerar CSV: " + e.getMessage());
        }
    }
}

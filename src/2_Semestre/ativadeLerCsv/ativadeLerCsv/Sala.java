import java.util.ArrayList;

public class Sala {

    public int id;
    public String numeroSala;
    public int capacidade;
    public String horarioProva;
    public ArrayList<String> provasPermitidas = new ArrayList<>();
    public ArrayList<Inscricao> alocados = new ArrayList<>();

    public Sala(int id, String numeroSala, int capacidade, String horarioProva, ArrayList<String> provasPermitidas) {
        this.id = id;
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
        this.horarioProva = horarioProva;
        this.provasPermitidas = provasPermitidas;
    }

    public boolean temVaga() {
        return alocados.size() < capacidade;
    }

    public boolean aceitaProva(String tipo) {
        return provasPermitidas.contains(tipo);
    }

    public String toString() {
        return numeroSala + " - " + horarioProva + " - capacidade " + capacidade;
    }
}

import java.util.ArrayList;

class Sala {
    private int id;
    private String numeroSala;
    private int capacidade;
    private String horario;
    private ArrayList<String> provasPermitidas;
    private int ocupacao = 0;

    public Sala(int id, String numeroSala, int capacidade, String horario, ArrayList<String> provasPermitidas) {
        this.id = id;
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
        this.horario = horario;
        this.provasPermitidas = provasPermitidas;
    }

    public String getNumeroSala() { return numeroSala; }
    public String getHorario() { return horario; }

    public boolean aceitaTipoProva(String tipo) {
        return provasPermitidas.contains(tipo);
    }

    public boolean temVaga() {
        return ocupacao < capacidade;
    }

    public void adicionarCandidato() {
        ocupacao++;
    }
}

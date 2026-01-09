public class IntervaloHorario {
    private int inicio;
    private int fim;
    private String horario;

    public IntervaloHorario(int inicio, int fim, String horario) {
        this.inicio = inicio;
        this.fim = fim;
        this.horario = horario;
    }

    public boolean contem(int cod) {
        return cod >= inicio && cod <= fim;
    }

    public String getHorario() {
        return horario;
    }
}

public class Intervalo {

    public int inicio;
    public int fim;
    public String horario;

    public Intervalo(int inicio, int fim, String horario) {
        this.inicio = inicio;
        this.fim = fim;
        this.horario = horario;
    }

    public boolean contem(int codigo) {
        return codigo >= inicio && codigo <= fim;
    }

    public String toString() {
        return inicio + "-" + fim + " => " + horario;
    }
}

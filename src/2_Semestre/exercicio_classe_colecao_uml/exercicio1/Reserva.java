public class Reserva {

    private String responsavel;
    private int lugares;

    public Reserva(String responsavel, int lugares) {
        this.responsavel = responsavel;
        this.lugares = lugares;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getLugares() {
        return lugares;
    }
}

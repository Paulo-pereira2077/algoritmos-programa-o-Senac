import java.util.LinkedList;
import java.util.Queue;

public class ControleReservas {

    private Queue<Reserva> reservas = new LinkedList<>();

    public void novaReserva(String resp, int lugares) {
        reservas.add(new Reserva(resp, lugares));
        System.out.println("Reserva adicionada!");
    }

    public void listar() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva cadastrada.");
            return;
        }

        System.out.println("\n--- LISTA DE RESERVAS ---");

        int i = 1;
        for (Reserva r : reservas) {
            System.out.println(i + ". " + r.getResponsavel() + ", " + r.getLugares() + " lugares");
            i++;
        }

        System.out.println("-------------------------\n");
    }

    public Reserva proximo() {
        if (reservas.isEmpty()) {
            System.out.println("Nenhuma reserva na fila.");
            return null;
        }

        return reservas.poll(); // remove e retorna o primeiro da fila
    }
}

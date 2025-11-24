import java.util.ArrayList;

public class GerenciadorTarefas {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void novaTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada!");
    }

    public void listar() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }

        System.out.println("\n--- LISTA DE TAREFAS ---");
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa t = tarefas.get(i);

            String status = t.isConcluida() ? "(x)" : "( )";

            System.out.println(i + ". " + status + " " + t.getCodigo() + " - " + t.getDescricao());
        }
        System.out.println("------------------------\n");
    }

    public void remover(int posicao) {
        if (posicao >= 0 && posicao < tarefas.size()) {
            tarefas.remove(posicao);
            System.out.println("Tarefa removida!");
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void alterar(int posicao, String codigo, String descricao) {
        if (posicao >= 0 && posicao < tarefas.size()) {
            Tarefa t = tarefas.get(posicao);
            t.setCodigo(codigo);
            t.setDescricao(descricao);
            System.out.println("Tarefa alterada!");
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void concluir(int posicao) {
        if (posicao >= 0 && posicao < tarefas.size()) {
            tarefas.get(posicao).setConcluida(true);
            System.out.println("Tarefa marcada como concluída!");
        } else {
            System.out.println("Posição inválida!");
        }
    }
}

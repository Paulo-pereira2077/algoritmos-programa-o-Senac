import java.util.ArrayList;

public class Blacklist {

    private ArrayList<String> pessoas = new ArrayList<>();

    public void adicionar(String pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada!");
    }

    public void listar() {
        if (pessoas.isEmpty()) {
            System.out.println("A lista está vazia.");
            return;
        }

        System.out.println("\n--- LISTA NEGRA ---");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(i + ". " + pessoas.get(i));
        }
        System.out.println("-------------------\n");
    }

    public void remover(int posicao) {
        if (posicao >= 0 && posicao < pessoas.size()) {
            pessoas.remove(posicao);
            System.out.println("Pessoa removida!");
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void alterar(int posicao, String novoNome) {
        if (posicao >= 0 && posicao < pessoas.size()) {
            pessoas.set(posicao, novoNome);
            System.out.println("Nome alterado!");
        } else {
            System.out.println("Posição inválida!");
        }
    }
}

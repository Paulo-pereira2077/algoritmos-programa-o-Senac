import java.util.ArrayList;

public class Blacklist {

    // 1. O ArrayList deve ser privado
    private ArrayList<String> pessoas = new ArrayList<>();

    // O Scanner DEVE ser criado e usado APENAS na classe App, ou como parâmetro.
    // Variáveis de controle (opcao, i, pessoa, etc.) não devem estar aqui.

    // Bloco de inicialização (Construtor implícito ou explícito)
    public Blacklist() {
        // 2. Adiciona dados iniciais de forma correta (dentro do construtor)
        this.pessoas.add("João");
        this.pessoas.add("Maria");
    }

    public void adicionar(String pessoa) {
        if (pessoa != null && !pessoa.trim().isEmpty()) {
            this.pessoas.add(pessoa);
            System.out.println("Nome '" + pessoa + "' adicionado com sucesso à Blacklist.");
        } else {
            System.out.println("Erro: O nome não pode ser vazio.");
        }
    }

    public void listar() {
        if (pessoas.isEmpty()) {
            System.out.println("\n A Blacklist está vazia.");
            return;
        }

        System.out.println("\n === Lista de Nomes (Blacklist) ===");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.printf("%d. %s\n", i, pessoas.get(i));
        }
        System.out.println("------------------------------------");
    }

    public void remover(int posicao) {
        if (posicao >= 0 && posicao < pessoas.size()) {
            String nomeRemovido = pessoas.remove(posicao);
            System.out.println("Nome '" + nomeRemovido + "' removido da posição " + posicao + ".");
        } else {
            System.out.println("Erro: Posição inválida (" + posicao + "). A remoção falhou.");
        }
    }

    public void alterar(int posicao, String novoNome) {
        if (posicao >= 0 && posicao < pessoas.size() && novoNome != null && !novoNome.trim().isEmpty()) {
            String nomeAntigo = pessoas.set(posicao, novoNome);
            System.out.println("Nome na posição " + posicao + " alterado de '" + nomeAntigo + "' para '" + novoNome + "'.");
        } else {
            System.out.println("Erro: Posição inválida ou nome vazio. A alteração falhou.");
        }
    }
}
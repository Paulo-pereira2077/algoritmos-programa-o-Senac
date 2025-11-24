import java.util.Stack;

public class ListaReproducao {

    private Stack<Musica> itens = new Stack<>();

    public void adicionar(Musica musica) {
        itens.push(musica);
        System.out.println("Música adicionada à playlist!");
    }

    public void listar() {
        if (itens.isEmpty()) {
            System.out.println("Nenhuma música na playlist.");
            return;
        }

        System.out.println("\n--- PLAYLIST ---");

        for (int i = 0; i < itens.size(); i++) {
            Musica m = itens.get(i);
            System.out.println((i + 1) + ". " + m.getNome() + " (" + m.getArtista() + ")");
        }

        System.out.println("----------------\n");
    }

    public void tocarProxima() {
        if (itens.isEmpty()) {
            System.out.println("Não há músicas para tocar.");
            return;
        }

        Musica m = itens.pop();
        System.out.println("Tocando agora: " + m.getNome() + " - " + m.getArtista());

        try {
            Runtime.getRuntime().exec(
                "cmd.exe /C start microsoft-edge:https://www.youtube.com/watch?v=" + m.getCodYoutube()
            );
        } catch (Exception e) {
            System.out.println("Erro ao abrir o navegador.");
        }
    }
}

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import modelos.*;

public class Relatorio {

    private ArrayList<Produto> produtos;

    public Relatorio(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void listar() {

        Set<String> produtosFiltrados = new HashSet<>();

        for (Produto produto : produtos) {
            produtosFiltrados.add(produto.getCod() + " - " + produto.getNome());
        }

        produtosFiltrados.forEach(System.out::println);
        System.out.println();
    }

    public void busca(String busca) {

        ArrayList<Produto> filtrados = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(busca.toLowerCase())) {
                filtrados.add(produto);
            }
        }

        for (Produto produto : filtrados) {
            System.out.printf(
                "Mercado: %s | Código: %s | Nome: %s | Preço: %.2f%n",
                produto.getMercado(),
                produto.getCod(),
                produto.getNome(),
                produto.getPreco()
            );
        }

        System.out.println();
    }

    public void CompararPreços(String cod) {

        ArrayList<Produto> filtrados = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto.getCod().equals(cod)) {
                filtrados.add(produto);
            }
        }

        if (filtrados.isEmpty()) {
            System.out.println("Não foi encontrado nenhum produto :(");
            return;
        }

        System.out.println("\n\nProduto: " + filtrados.get(0).getNome());
        System.out.println("Cód.: " + filtrados.get(0).getCod());

        String mercado = filtrados.get(0).getMercado();
        LocalDate data = LocalDate.parse(filtrados.get(0).getData());
        double maior = filtrados.get(0).getPreco();
        double menor = filtrados.get(0).getPreco();
        double ultimo = filtrados.get(0).getPreco();
        double menorTodos = filtrados.get(0).getPreco();
        String recomendado = mercado;

        System.out.println("\n" + mercado);

        for (Produto p : filtrados) {

            if (p.getMercado().equals(mercado)) {
                
                LocalDate dataAtual = LocalDate.parse(p.getData());
                double preco = p.getPreco();

                if (dataAtual.isAfter(data)) {
                    data = dataAtual;
                    ultimo = preco;
                }

                if (preco < menor) menor = preco;
                if (preco > maior) maior = preco;
                if (preco < menorTodos) {
                    menorTodos = preco;
                    recomendado = p.getMercado();
                }

            } else {

                System.out.printf("""
                    - Último preço: R$ %.2f - %s
                    - Maior preço: R$ %.2f
                    - Menor preço: R$ %.2f
                    
                """, ultimo, data, maior, menor);

                mercado = p.getMercado();
                System.out.println("\n" + mercado);

                data = LocalDate.parse(p.getData());
                maior = menor = ultimo = p.getPreco();
            }
        }

        System.out.printf("""
                - Último preço: R$ %.2f - %s
                - Maior preço: R$ %.2f
                - Menor preço: R$ %.2f

            """, ultimo, data, maior, menor);

        System.out.println("Recomendado:\n" + recomendado);
    }
}

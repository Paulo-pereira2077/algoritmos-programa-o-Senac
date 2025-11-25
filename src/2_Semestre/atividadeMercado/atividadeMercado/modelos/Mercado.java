package modelos;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

    private String nome; 
    private List<Produto> produtos;

    public Mercado(String nome, List<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos != null ? produtos : new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}

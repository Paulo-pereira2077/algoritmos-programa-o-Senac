package modelos;

public class Produto {

    private String mercado;
    private String cod;
    private String nome;
    private double preco;
    private String data;

    public Produto(String mercado, String cod, String nome, double preco, String data) {
        this.mercado = mercado;
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
        this.data = data;
    }

    public String getMercado() {
        return mercado;
    }

    public String getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getData() {
        return data;
    }
}

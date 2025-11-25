public class Inscricao {

    public int codigo;
    public String nome;
    public String tipoProva;
    public String horarioProva;

    public Inscricao(int codigo, String nome, String tipoProva) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipoProva = tipoProva;
    }

    public String toString() {
        return codigo + " - " + nome + " - " + tipoProva + " - " + horarioProva;
    }
}

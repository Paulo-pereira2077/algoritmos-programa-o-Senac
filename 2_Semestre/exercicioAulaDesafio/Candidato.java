public class Candidato {
    private int codInscricao;
    private String nome;
    private String tipoProva;

    public Candidato(int codInscricao, String nome, String tipoProva) {
        this.codInscricao = codInscricao;
        this.nome = nome;
        this.tipoProva = tipoProva;
    }

    public int getCodInscricao() { return codInscricao; }
    public String getNome() { return nome; }
    public String getTipoProva() { return tipoProva; }
}

public class Tarefa {

    private String codigo;
    private String descricao;
    private boolean concluida;

    public Tarefa(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }
}

public class Resultado {

    private double mensalidade;
    private double desconto;
    private String curso;
    private String programaBolsa;

    public Resultado(double mensalidade, double desconto, String curso, String programaBolsa) {
        this.mensalidade = mensalidade;
        this.desconto = desconto;
        this.curso = curso;
        this.programaBolsa = programaBolsa;
    }

    public double lerMensalidade() {
        return mensalidade;
    }

    public String lerCurso() {
        return curso;
    }

    public String lerBolsa() {
        return programaBolsa;
    }

    public double lerDesconto() {
        return desconto;
    }
}


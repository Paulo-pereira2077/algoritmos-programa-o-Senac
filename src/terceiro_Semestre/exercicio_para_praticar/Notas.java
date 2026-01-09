package terceiro_Semestre.exercicio_para_praticar;

public class Notas {

    private double nota1;
    private double nota2;
    private double nota3;

    public void setNotas(double n1, double n2, double n3) {
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }
}

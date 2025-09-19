package exercicioAula;

public class Calculo {

    public double nota1;
    public double nota2;
    public double nota3;

    public double media;
    
    public void lerMedia(){

        this.media = calcularMedia(nota1, nota2, nota3);         
    }

    private double calcularMedia(double nota1, double nota2, double nota3){

        double calculo = (this.nota1 + this.nota2 + this.nota3) / 3;
        return calculo;
    }
}

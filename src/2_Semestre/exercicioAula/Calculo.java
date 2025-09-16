package exercicioAula;

public class Calculo {


    public double totalP(double p){

        return p * 13.50;        
    }

    public double totalM(double m){

        return m * 15.0;        
    }

    public double totalG(double g){

        return g * 17.50;        
    }

    public double totalAPagar(double resultadoP, double resultadoM, double resultadoG){

        return resultadoP + resultadoM + resultadoG;
    }
}

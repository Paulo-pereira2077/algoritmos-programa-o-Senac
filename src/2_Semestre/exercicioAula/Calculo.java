package exercicioAula;

public class Calculo {

    public int qtdIngresso;
    public String tipoIngresso;

    public double verificarSituacao(int qtdIngresso, String tipoIngresso){

        this.qtdIngresso = qtdIngresso;
        this.tipoIngresso = tipoIngresso;

        if (this.tipoIngresso.equalsIgnoreCase("Meia")){

            return calcularMeia(qtdIngresso);
        }
        else if (this.tipoIngresso.equalsIgnoreCase("Inteira")){
            return calcularInteira(qtdIngresso);
        }
        else{
            System.out.println("Tipo de ingresso inválido!");
            return 0.0;
        }
    }

   private double calcularMeia(int qtdIngresso){

        double calculoM = qtdIngresso * 14.25;
        return calculoM;
    }

    private double calcularInteira(int qtdIngresso){

        double calculoI = qtdIngresso * 28.5;
        return calculoI;
    }
}

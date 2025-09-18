package exercicioAula;

public class Calculo {

    public double verificarSituacao(int qtdIngresso, String tipoIngresso){

        if (tipoIngresso.equalsIgnoreCase("Meia")){

            return calcularMeia(qtdIngresso);
        }
        else if (tipoIngresso.equalsIgnoreCase("Inteira")){
            return calcularInteira(qtdIngresso);
        }
        else{
            System.out.println("Tipo de ingresso inválido!");
            return 0.0;
        }
    }

   public double calcularMeia(int qtdIngresso){

        double calculoM = qtdIngresso * 14.25;
        return calculoM;
    }

    public double calcularInteira(int qtdIngresso){

        double calculoI = qtdIngresso * 28.5;
        return calculoI;
    }
}

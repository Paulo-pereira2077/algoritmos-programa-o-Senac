package exercicioAula;

public class Dia {
    public int num;
    public String dia;


    private void rodarDiaSemana() {        
            switch (num) {
            case 0:
                dia = "Domingo";
                break;
            case 1:
                dia = "Segunda-feira";
                break;
            case 2:
                dia = "Terça-feira";
                break;
            case 3:
                dia = "Quarta-feira";
                break;
            case 4:
                dia = "Quinta-feira";
                break;
            case 5:
                dia = "Sexta-feira";
                break;
            case 6:
                dia = "Sábado";
                break;
            default:
                dia = "Dia inválido";
                break;
        }
    }

    public void lerDia(){
        rodarDiaSemana();
    }
}

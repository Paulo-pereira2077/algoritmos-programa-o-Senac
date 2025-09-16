package exercicioAula;

public class exercicioClasse {

    public static void main(String[] args) {

        Tela tela = new Tela();
        Dia dia = new Dia();

        tela.apresentacao();
                      
       dia.num = tela.pedirDia("Digite um número de 0 a 6 para saber o dia da semana");
       tela.diaSemana(dia.num);
    }
    
}

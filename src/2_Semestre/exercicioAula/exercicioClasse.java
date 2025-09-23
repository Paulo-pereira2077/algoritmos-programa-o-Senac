package exercicioAula;

public class exercicioClasse {
    public static void main(String[] args) {

        Tela tela = new Tela();
        Calculo calculo = new Calculo();
        
        tela.apresentacao();

        calculo.nota1 = tela.pedirNotas("Digite sua preimeira nota:");
        calculo.nota2 = tela.pedirNotas("Digite sua segunda nota:");
        calculo.nota3 = tela.pedirNotas("Digite sua terceira nota:");

        calculo.rodarBoletim();

        tela.exibirResultado(calculo.lerMedia(), calculo.lerSituacao());

    }    
}

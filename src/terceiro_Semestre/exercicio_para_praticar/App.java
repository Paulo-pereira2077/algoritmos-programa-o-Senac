package terceiro_Semestre.exercicio_para_praticar;

public class App {

    public static void main(String[] args) {

        Tela tela = new Tela();
        Notas notas = new Notas();

        tela.titulo();

        double n1 = tela.pedirNotas("Digite a primeira nota:");
        double n2 = tela.pedirNotas("Digite a segunda nota:");
        double n3 = tela.pedirNotas("Digite a terceira nota:");

        notas.setNotas(n1, n2, n3);

        double media = notas.calcularMedia();

        tela.resultado(media);
    }
}

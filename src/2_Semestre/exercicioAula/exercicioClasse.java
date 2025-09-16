package exercicioAula;

public class exercicioClasse {

    public static void main(String[] args) {

        Tela tela = new Tela();
        Calculo calculo = new Calculo();
        Nota nota = new Nota();

        tela.apresentacao();

       nota.nota1 = tela.pedirNumero("Digite sua nota: ");
       nota.nota2 = tela.pedirNumero("Digite sua nota: ");
       nota.nota3 = tela.pedirNumero("Digite sua nota: ");

        double resultado = calculo.calcular(nota.nota1,nota.nota2, nota.nota3);

        tela.exibirSituacao(resultado);

    }

} 
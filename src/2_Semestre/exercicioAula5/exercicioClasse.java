package exercicioAula5;

public class exercicioClasse {
    
public static void main(String[] args) {

    Tela tela = new Tela();
    Boletim boletim = new Boletim();

    // exibe a logo do programa
   tela.apresentacao();

// recebe as notaas
double nota1 = tela.pedirNotas("Digite sua 1º nota:");

double nota2 = tela.pedirNotas("Digite sua 2º nota:");

double nota3 = tela.pedirNotas("Digite sua 3º nota:");

    double calculoMedia = boletim.calculando(nota1, nota2, nota3);

    boletim.verificandoSituacao(calculoMedia);

}

}
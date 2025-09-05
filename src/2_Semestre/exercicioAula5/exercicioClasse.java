package exercicioAula5;

public class exercicioClasse {
    
public static void main(String[] args) {

    Tela tela = new Tela();
    Calculo calculo = new Calculo();

    // exibe a logo do programa
   tela.apresentacao();

// recebe as notaas
double num = tela.pedirNumero("Digite um número: ");

double resultado = calculo.dobrarNumero(num);

    tela.exibirSituacao(resultado, num);

}

}
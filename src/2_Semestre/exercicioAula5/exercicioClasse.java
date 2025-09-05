package exercicioAula5;

public class exercicioClasse {
    
public static void main(String[] args) {

    Tela tela = new Tela();
    Calculo calculo = new Calculo();

    tela.apresentacao();

    int num1 = tela.pedirNumero("Digite um número: ");
    int num2 = tela.pedirNumero("Digite um número: ");

    int resultado = calculo.somarNumeros(num1, num2);

    tela.exibir(num1, num2, resultado);

    }

}
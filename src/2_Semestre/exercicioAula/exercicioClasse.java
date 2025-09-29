package exercicioAula;

public class exercicioClasse {
    public static void main(String[] args) {

        Tela tela = new Tela();
        Numero numero = new Numero();

        tela.apresentacao();

        numero.num = tela.pedirNumero("Digite um número");
        
        numero.lerResultado();

        tela.exibirResultado(numero.num, numero.resultado);
    }    
}

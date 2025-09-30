package exercicioAula;

public class exercicioClasse {
    public static void main(String[] args) {

        Tela tela = new Tela();
        Numero numero = new Numero();

        tela.apresentacao();

        numero.num = tela.pedirNum("Digite um número: ");

        numero.lerFormato();
        System.out.println(numero.resultado);

    }    
}

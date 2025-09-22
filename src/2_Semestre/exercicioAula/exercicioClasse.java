package exercicioAula;

public class exercicioClasse {
    public static void main(String[] args) {

    Tela tela = new Tela();
    Numero numero = new Numero();
        
    tela.apresentacao();

    System.out.println("Digite dois números: ");
        numero.num1 = tela.pedirNumeros();
        numero.num2 = tela.pedirNumeros();

    numero.lerContagem();

    }    
}

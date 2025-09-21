import java.util.Scanner;

public class normal {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Exercicio 8 - Informando a cor resultante");       

        String cor1;
        String cor2;
        
        System.out.println("Para saber a cor resultante apenas digite as cores primárias (vermelho, azul ou amarelo)");
        System.out.print("Digite a primeira cor: ");
        cor1 = entrada.next();
        
        System.out.print("Digite a segunda cor: ");
        cor2 = entrada.next();

        boolean corPrimaria1 = cor1.equalsIgnoreCase("Vermelho") ||
                            cor1.equalsIgnoreCase("Azul") ||
                            cor1.equalsIgnoreCase("Amarelo");

        boolean corPrimaria2 = cor2.equalsIgnoreCase("Vermelho") ||
                            cor2.equalsIgnoreCase("Azul") ||
                            cor2.equalsIgnoreCase("Amarelo");

        String resultado;
     
        if (corPrimaria1 && corPrimaria2) {
 
            if (cor1.equalsIgnoreCase(cor2)) {
                resultado = cor1;
            } else if ((cor1.equalsIgnoreCase("Vermelho") && cor2.equalsIgnoreCase("Azul")) || (cor1.equalsIgnoreCase("Azul") && cor2.equalsIgnoreCase("Vermelho"))) {
                resultado = "Roxo";
            } else if ((cor1.equalsIgnoreCase("Vermelho") && cor2.equalsIgnoreCase("Amarelo")) || (cor1.equalsIgnoreCase("Amarelo") && cor2.equalsIgnoreCase("Vermelho"))) {
                resultado = "Laranja";
            } else { 
                resultado = "Verde";
            }
        } else {
            resultado = "Apenas cores primárias são aceitas";
        }
 
        System.out.println("A combinação das cores é: " + resultado); 
                            

        entrada.close();
    }
}

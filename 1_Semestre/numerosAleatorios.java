import java.util.Random;
public class numerosAleatorios {
    public static void main (String [] args){
        Random random = new Random ();
        int menor;
        int armazenamento [] = new int [10];
        
        // sorteia e armazena no vetor
        System.out.println ("Os números são: ");

        for (int i = 0; i < armazenamento.length; i++){
            armazenamento [i]= random.nextInt(10) + 1;
            System.out.print(armazenamento[i] + " ");
        }

        // menor número sorteado
        menor = armazenamento[0];
        for (int i = 0; i < armazenamento.length; i++){
            if (armazenamento[i] < menor){
                menor = armazenamento[i];
            }
        } 

        // exibe o menor número do vetor
        System.out.println("O menor número é " + menor);
        
    }
}

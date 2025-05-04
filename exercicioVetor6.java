public class exercicioVetor6 {
    public static void main (String[] args){
        int[] A = new int[] {8, 9, 2, 8};
        int[] B = new int[] {40, 22, 81, 4, 58, 80};
        int[] AB = new int[A.length + B.length];

        //Vetor A
        for(int i = 0; i < 4; i++){
            System.out.println("Vetor A: " + A[i]);           
        }

        System.out.println("========================================");

        //Vetor B
        for(int i = 0; i < 6; i++){
            System.out.println("Vetor B: " + B[i]);
        }

        System.out.println("========================================");

        //Vetor AB
        
        for (int i = 0; i < A.length; i++) {
            AB[i] = A[i];
        }

        // Copiando os elementos de B para C, a partir do final de A
        for (int i = 0; i < B.length; i++) {
            AB[i + A.length] = B[i];
        }

        // Imprimindo o vetor C
        System.out.println("Vetor AB (junção de A e B): ");
        for (int i = 0; i < AB.length; i++) {
            System.out.print(AB[i] + " ");
        }
    }
}

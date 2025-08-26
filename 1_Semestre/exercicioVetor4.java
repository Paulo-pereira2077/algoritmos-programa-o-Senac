public class exercicioVetor4 {
    public static void main(String[] args) {
        int[] A = new int[] {1, 5, 7, 3, 8};
        int[] B = new int[5];

        //Vetor A
        for (int i = 0; i < 5; i++) {
            System.out.println("Vetor A: " + A[i]);
        }
    System.out.println("========================================");
        
        //Vetor B
        for (int i = 0; i < 5; i++){
            B[i] = A[i] * 3;

            System.out.println("Vetor B: " + B[i]);
        }

    }
}

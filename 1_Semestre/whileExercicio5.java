public class whileExercicio5 {
    public static void main(String[] args) {
        int num = 5;
        int multiplicador = 1;

        do {
            System.out.println(num + " x " + multiplicador + " = " + (num * multiplicador));
            multiplicador++;  
        } while (multiplicador <= 10);
    }
}
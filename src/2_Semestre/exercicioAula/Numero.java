package exercicioAula;

public class Numero {
      
    public int num1;
    public int num2;


    public void lerContagem(){

        contagem(num1, num2);
    }


    private void contagem(int num1, int num2){

        for (int i = num1; i >= num2; i--) {
            System.out.println(i);
        }
    }
}

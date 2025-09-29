package exercicioAula;
 
public class Numero {
 
    public int num;
    
     public int calcularNumero(int num){
        int numSomado = 0;

        for (int i = 1; i <= num; i++){
            numSomado += i;
        }
        return numSomado;
    } 
}

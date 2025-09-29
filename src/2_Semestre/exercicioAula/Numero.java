package exercicioAula;
 
public class Numero {
 
    public int num;

    public int resultado;

    public int lerResultado(){
        this.resultado = calcularNumero(num);
        return resultado;
    }
    
     private int calcularNumero(int num){
        int numSomado = 0;

        for (int i = 1; i <= this.num; i++){
            numSomado += i;
        }
        return numSomado;
    } 
}

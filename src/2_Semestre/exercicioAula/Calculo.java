package exercicioAula;

public class Calculo {

       public double nota1;
       public double nota2;
       public double nota3;   

       public double media;

       public double lerMedia(){
         this.media = calcularMedia(nota1, nota2, nota3);
         return media;
       }
       
       private double calcularMedia(double nota1, double nota2, double nota3){
 
        return (nota1 + nota2 + nota3) / 3;       
    }
}

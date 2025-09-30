package exercicioAula;
 
public class Numero {
 
    public int num;
    public String resultado;
    
    public String lerFormato(){
        this.resultado = formato();
        return resultado;
    }


private String formato() {
    String forma = "";

    for (int y = 0; y < this.num; y++) {
        for (int x = 0; x < this.num; x++) {
            forma += "*";
        }
        forma += "\n";
    }

    return forma;
}
     
}

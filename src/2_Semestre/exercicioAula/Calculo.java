package exercicioAula;

public class Calculo {

  public int qtdP;
  public int qtdM;
  public int qtdG;
  public double desconto;
  public double total;

  public double totalPagar(){

    return this.total = calcularTotal(qtdP, qtdM, qtdG);
  }

  public double lerDesconto(){

    return this.desconto = verificarDesconto();
  }

  private double verificarDesconto(){

    return desconto / 100;
  }

  private double calcularTotal(int qtdP, int qtdM, int qtdG){

    double preco = (qtdP * 13.50) + (qtdM * 15) + (qtdG * 17.50);
    double desc = this.desconto * preco;         
    return preco - desc;    
  }

}

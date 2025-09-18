package exercicioAula;

public class Acaiteria {

    public int qtdP;
    public int qtdM;
    public int qtdG;
    public int desconto; 

    public double pagamento;

    private double aplicarDesconto(double total) {
        return total * (this.desconto / 100.0); 
    }

    private double pagar() {
        double precoP = 13.5;
        double precoM = 15.0;
        double precoG = 17.5;

        double total = (this.qtdP * precoP) + (this.qtdM * precoM) + (this.qtdG * precoG);
        double des = aplicarDesconto(total);
        double v = total - des;
        return v;
    }

    public void verficarPagamento() {
        this.pagamento = pagar();
        System.out.printf("O total é R$%.2f%n", pagamento);
    }
}

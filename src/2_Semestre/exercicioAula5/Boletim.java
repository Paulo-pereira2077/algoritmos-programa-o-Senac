package exercicioAula5;
public class Boletim {
    public double calculando(double nota1, double nota2, double nota3){

    return (nota1 + nota2 + nota3) / 3;
}

public String verificandoSituacao(double calculoMedia){
    String situacao = "";

    if (calculoMedia >= 6){
        System.out.println("Aprovado!");
    }
    else {
        System.out.println("Reprovado!");
    }

    return situacao;
}

}

package exercicioAula;

public class Calculo {

    public double nota1;
    public double nota2;
    public double nota3;

    public double media;
    public String situacao;

    public void rodarBoletim(){
      this.media = calcularMedia();
      this.situacao = verificarSituacao();
    }

    public double lerMedia(){

      return this.media;
    }

    public String lerSituacao(){

      return this.situacao;
    }


    private double calcularMedia(){

      double calculoM = (this.nota1 + this.nota2 + this.nota3) / 3;
      return calculoM;
    }

    private String verificarSituacao(){

      String sit = "";

        if (this.media >= 8){
          sit = "Aprovado com Sucesso";
        }
        else if (this.media >= 6 && media <= 8){
          sit = "Aprovado";
        }
        else if (this.media >= 3 && media <= 6){
          sit = "Recuperação";
        }
        else if (this.media == 0){
          sit = "Desistente";
        }
        else {
          sit = "Reprovado";
        }

        return sit;
    }

}

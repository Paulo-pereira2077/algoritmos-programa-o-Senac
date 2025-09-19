package exercicioAula;

public class exercicioClasse {
    public static void main(String[] args) {

        Tela tela = new Tela();
        Calculo calculo = new Calculo();


        tela.apresentacao();                                  
        
        calculo.nota1 = tela.pedirNotas("Digite as suas notas: ");
        calculo.nota2 = tela.pedirNotas("Digite as suas notas: ");
        calculo.nota3 = tela.pedirNotas("Digite as suas notas: ");

        calculo.lerMedia();
        
        tela.exibirMedia(calculo.media);
        
        tela.verificarSituacao(calculo.media);
       
    }    
}


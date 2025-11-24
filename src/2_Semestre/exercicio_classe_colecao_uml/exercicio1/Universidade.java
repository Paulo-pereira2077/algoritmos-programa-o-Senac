public class Universidade {

    public Resultado calcularMensalidade(Opcoes op) {

    String curso = verificarNomeCurso(op.getCodCurso());
    if (curso.equals("INVÁLIDO")) {
        System.out.println("Código de curso inválido.");
        return null;
    }

    double mensalidade = verificarMensalidade(op.getCodCurso());

    String bolsa = verificarProgramaBolsa(op.getCodBolsa());
    double desconto = verificarDesconto(op.getCodBolsa());

    double mensalidadeFinal = mensalidade - (mensalidade * desconto);

    if (mensalidadeFinal < 0) mensalidadeFinal = 0;

    return new Resultado(mensalidadeFinal, mensalidade * desconto, curso, bolsa);
}



    public String verificarNomeCurso(String codCurso) {

        codCurso = codCurso.toUpperCase();

        switch (codCurso) {
            case "TSI":
                return "Sistemas para Internet";
            case "TADS":
                return "Análise e Desenvolvimento de Sistemas";
            case "BCC":
                return "Ciência da Computação";
            case "BSI":
                return "Sistemas de Informação";
            case "BEC":
                return "Engenharia da Computação";
            default:
                return "INVÁLIDO";
        }
    }


    public double verificarMensalidade(String codCurso) {

        codCurso = codCurso.toUpperCase();

        switch (codCurso) {
            case "TSI":
                return 915;
            case "TADS":
                return 836;
            case "BCC":
                return 1559;
            case "BSI":
                return 1400;
            case "BEC":
                return 1758;
            default:
                return 0;
        }
    }


    public String verificarProgramaBolsa(String codBolsa) {

        if (codBolsa.isBlank()) return "Nenhuma";

        codBolsa = codBolsa.toUpperCase();

        switch (codBolsa) {
            case "MON":
                return "Monitoria";
            case "EMP":
                return "Ensino Médio Público";
            case "ISE":
                return "Isenção";
            case "EXT":
                return "Projeto de Extensão";
            case "PES":
                return "Pesquisa Científica";
            default:
                return "INVÁLIDO";
        }
    }


    public double verificarDesconto(String codBolsa) {

    if (codBolsa.isBlank()) return 0;

    codBolsa = codBolsa.toUpperCase();

    switch (codBolsa) {
        case "MON": 
            return 0.25;
        case "EMP": 
            return 0.50;
        case "ISE": 
            return 1.00;
        case "EXT": 
            return 0.20;
        case "PES": 
            return 0.80;
        default:
            return 0;
    }
}

}

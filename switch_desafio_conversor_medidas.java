import java.util.Scanner;
public class switch_desafio {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        double valor_comprimento, resultado= 0;
        String unidadeMedida, medidaConvertida;

        //Recebe a unidade de medida
        System.out.println("Qual unidade de medida você quer converter (metros, quilômetros, centímetros ou jardas)? ");
        unidadeMedida = entrada.next();

        //Recebe a unidade de medida que será a conversão
        System.out.println("Qual unidade de medida será convertida (metros, quilômetros, centímetros ou jardas)? ");
        medidaConvertida = entrada.next();

        //Recebe o valor que será convertido
        System.out.println("Qual valor? ");
        valor_comprimento = entrada.nextDouble();

        switch(unidadeMedida){
            case "metros":
                switch(medidaConvertida){
                case "quilometros":
                resultado = valor_comprimento / 1000;
                break;

                case "centímetros":
                resultado = valor_comprimento * 100;
                break;
                
                case "jardas":
                resultado = valor_comprimento * 1.0936;
                break;
            }
            break;

            case "quilometros":
                switch(medidaConvertida){
                case "metros":
                resultado = valor_comprimento * 1000;
                break;

                case "centímetros":
                resultado = valor_comprimento * 100000;
                break;
                
                case "jardas":
                resultado = valor_comprimento * 1093.61;
                break;
            }
            break;

            case "jardas":
                switch(medidaConvertida){
                case "quilometros":
                resultado = valor_comprimento / 1094;
                break;

                case "centímetros":
                resultado = valor_comprimento * 91.44;
                break;
                
                case "metros":
                resultado = valor_comprimento / 1.094;
                break;
            }
            break;

            case "centimetros":
                switch(medidaConvertida){
                case "quilometros":
                resultado = valor_comprimento / 100000;
                break;

                case "metros":
                resultado = valor_comprimento / 100;
                break;
                
                case "jardas":
                resultado = valor_comprimento * 91.44;
                break;              
            }

            default:                
                System.out.println("Unidade de medida não reconhecida!");
                break;
        }
        
        System.out.println("O valor convertido é: " + resultado);
        

        entrada.close();
    }    
}

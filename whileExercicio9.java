import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int codigo, quantidade;
        double totalCompra = 0, preco = 0, totalProduto;
        char continuar;

    System.out.println("Bem vindo a lanchonete");
    System.out.println("Escolha o seu pedido");

        do {
            System.out.println("Cardápio:");
            System.out.println("100 - Cachorro Quente - R$ 1,20");
            System.out.println("101 - Bauru Simples - R$ 1,30");
            System.out.println("102 - Bauru com Ovo - R$ 1,50");
            System.out.println("103 - Hambúrguer - R$ 1,20");
            System.out.println("104 - Cheeseburguer - R$ 1,30");
            System.out.println("105 - Refrigerante - R$ 1,00");

            System.out.print("Digite o código do produto desejado: ");
            codigo = entrada.nextInt();
            
            System.out.print("Digite a quantidade desejada: ");
            quantidade = entrada.nextInt();
            

            switch (codigo) {
                case 100:
                    preco = 1.20;
                    break;
                case 101:
                    preco = 1.30;
                    break;
                case 102:
                    preco = 1.50;
                    break;
                case 103:
                    preco = 1.20;
                    break;
                case 104:
                    preco = 1.30;
                    break;
                case 105:
                    preco = 1.00;
                    break;
                default:
                    System.out.println("Código inválido! Produto não encontrado.");
            }

            if (preco > 0) {
                totalProduto = preco * quantidade;
                totalCompra += totalProduto;
                System.out.printf("Subtotal do produto: R$ " + totalProduto);
            }

            System.out.print("Deseja comprar mais produtos? (S/N): ");
            continuar = entrada.next().toUpperCase().charAt(0); 
            
        } 
        
        while (continuar == 'S');

        System.out.println("Valor total da compra: R$ " + totalCompra);
        
        entrada.close();
    }
}
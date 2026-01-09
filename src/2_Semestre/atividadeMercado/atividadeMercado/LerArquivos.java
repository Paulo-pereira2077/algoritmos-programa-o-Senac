import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import modelos.*;

public class LerArquivos {

    private static final String PASTA = "arquivos";

    public static ArrayList<Produto> listarArquivos() {

        File pasta = new File(PASTA);
        File[] arquivos = pasta.listFiles();
        ArrayList<Produto> produtos = new ArrayList<>();

        if (arquivos == null) {
            System.out.println("Nenhum arquivo encontrado na pasta.");
            return produtos;
        }

        for (File arquivo : arquivos) {
            try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

                System.out.println("Lendo arquivo: " + arquivo.getName());
                String linha;

                while ((linha = br.readLine()) != null) {

                    String[] valores = linha.split(",");
                    Produto p = new Produto(
                        arquivo.getName(),
                        valores[0],
                        valores[1],
                        Double.parseDouble(valores[2]),
                        valores[3]
                    );

                    produtos.add(p);
                }

            } catch (IOException e) {
                System.out.println("Erro ao ler arquivo: " + arquivo.getName());
                e.printStackTrace();
            }
        }

        return produtos;
    }
}

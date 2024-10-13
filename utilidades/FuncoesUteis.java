package utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FuncoesUteis {

    public static String soma(int n1, int n2) {
        int result = n1 + n2;
        String resultado = "\n\n\no resultado da soma entre " + n1 + " e " + n2 + " e igual a: " + result;

        return resultado;
    }

    public static void triangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }

    public static void printArquivo(String arquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
    package main;

    import utilidades.FuncoesUteis;

    public class FuncoesMain {
        public static void main(String[] args) {
            String result = FuncoesUteis.soma(5, 5);
            System.out.println(result);


            System.out.println("\n\n\nTriangulo com 5 de altura: \n");
            FuncoesUteis.triangulo(5);

            System.out.println("\n\n\nConteúdo do arquivo teste.txt:\n");
            FuncoesUteis.printArquivo("main/receitaBrownie.txt");
        }
    }

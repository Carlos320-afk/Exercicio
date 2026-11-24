import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] vendas = new int[3][4];
        int totalGeral = 0;
        int maiorVenda = Integer.MIN_VALUE;

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                vendas[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < vendas.length; i++) {
            int totalFuncionario = 0;

            for (int j = 0; j < vendas[i].length; j++) {
                totalFuncionario += vendas[i][j];

                if (vendas[i][j] > maiorVenda) {
                    maiorVenda = vendas[i][j];
                }
            }

            totalGeral += totalFuncionario;
            System.out.println("Funcionário " + (i + 1) + ": " + totalFuncionario);
        }

        System.out.println("Total geral: " + totalGeral);
        System.out.println("Maior venda: " + maiorVenda);

        sc.close();
    }
}
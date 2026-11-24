import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] vendas = new int[3][4];

        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                vendas[i][j] = sc.nextInt();
            }
        }

        int maiorTotal = Integer.MIN_VALUE;
        int melhorDia = 0;

        for (int j = 0; j < vendas[0].length; j++) {
            int totalDia = 0;

            for (int i = 0; i < vendas.length; i++) {
                totalDia += vendas[i][j];
            }

            System.out.println("Dia " + (j + 1) + ": " + totalDia);

            if (totalDia > maiorTotal) {
                maiorTotal = totalDia;
                melhorDia = j;
            }
        }

        System.out.println("Maior total: Dia " + (melhorDia + 1) + " (" + maiorTotal + ")");

        sc.close();
    }
}
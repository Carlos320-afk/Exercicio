import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + (j < matriz[i].length - 1 ? " " : "\n"));
            }
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][matriz.length - 1 - i];
        }

        System.out.println("Soma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundária: " + somaSecundaria);

        sc.close();
    }
}
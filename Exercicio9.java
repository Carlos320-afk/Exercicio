import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] notas = new int[3][2];
        int totalGeral = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                notas[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            int somaAluno = 0;
            for (int j = 0; j < notas[i].length; j++) {
                somaAluno += notas[i][j];
            }
            totalGeral += somaAluno;
            System.out.println("Soma do aluno " + (i + 1) + ": " + somaAluno);
        }

        System.out.println("Total geral: " + totalGeral);

        sc.close();
    }
}
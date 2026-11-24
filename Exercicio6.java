import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        int[] D = new int[10];

        System.out.print("A: ");
        for (int i = 0; i < 5; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("B: ");
        for (int i = 0; i < 5; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
            D[2 * i] = A[i];
            D[2 * i + 1] = B[i];
        }

        System.out.print("C: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + (i < C.length - 1 ? " " : "\n"));
        }

        System.out.print("D: ");
        for (int i = 0; i < D.length; i++) {
            System.out.print(D[i] + (i < D.length - 1 ? " " : "\n"));
        }

        sc.close();
    }
}
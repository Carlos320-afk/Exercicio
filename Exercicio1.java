import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int pares = 0, impares = 0, soma = 0;

        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
            soma += vetor[i];
            if (vetor[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + (i < 9 ? " " : "\n"));
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
        System.out.println("Soma: " + soma);
        
        sc.close();
    }
}
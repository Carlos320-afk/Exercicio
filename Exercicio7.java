import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] original = new int[10];
        for (int i = 0; i < original.length; i++) {
            original[i] = sc.nextInt();
        }

        int[] temp = new int[original.length];
        int qtdUnicos = 0;

        for (int i = 0; i < original.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < qtdUnicos; j++) {
                if (original[i] == temp[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                temp[qtdUnicos] = original[i];
                qtdUnicos++;
            }
        }

        int[] semRepetidos = new int[qtdUnicos];
        for (int i = 0; i < qtdUnicos; i++) {
            semRepetidos[i] = temp[i];
        }

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + (i < original.length - 1 ? " " : "\n"));
        }

        System.out.print("Sem repetidos: ");
        for (int i = 0; i < semRepetidos.length; i++) {
            System.out.print(semRepetidos[i] + (i < semRepetidos.length - 1 ? " " : "\n"));
        }

        int removidos = original.length - semRepetidos.length;
        System.out.println("Valores removidos: " + removidos);

        sc.close();
    }
}
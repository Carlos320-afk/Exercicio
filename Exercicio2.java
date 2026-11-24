import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale ptBR = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(ptBR);

        double[] notas = new double[5];
        double soma = 0;
        int aprovados = 0, reprovados = 0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = sc.nextDouble();
            soma += notas[i];

            if (notas[i] >= 7.0) {
                aprovados++;
            } else {
                reprovados++;
            }
        }

        double media = soma / notas.length;

        System.out.printf(ptBR, "Média da turma: %.2f%n", media);
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);

        sc.close();
    }
}
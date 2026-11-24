import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale ptBR = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(ptBR);

        String[] dias = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        double[] temperaturas = new double[7];
        double soma = 0;
        int indiceMaisQuente = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = sc.nextDouble();
            soma += temperaturas[i];

            if (temperaturas[i] > temperaturas[indiceMaisQuente]) {
                indiceMaisQuente = i;
            }
        }

        double media = soma / temperaturas.length;

        System.out.printf(ptBR, "Média da semana: %.1f °C%n", media);
        System.out.println("Dias acima da média:");

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > media) {
                System.out.printf(ptBR, "%s (%.1f °C)%n", dias[i], temperaturas[i]);
            }
        }

        System.out.printf(ptBR, "Dia mais quente: %s (%.1f °C)%n",
                dias[indiceMaisQuente], temperaturas[indiceMaisQuente]);

        sc.close();
    }
}
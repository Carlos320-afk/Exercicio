import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Locale ptBR = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in).useLocale(ptBR);

        double[] salarios = new double[5];

        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = sc.nextDouble();
        }

        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] < 2000.0) {
                salarios[i] *= 1.10;
            }
            System.out.printf(ptBR, "Funcionário %d: R$ %.2f%n", (i + 1), salarios[i]);
        }

        sc.close();
    }
}
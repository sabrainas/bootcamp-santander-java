import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        // Calcular o valor final do investimento com juros compostos
        double valorFinal = jurosCompostos(valorInicial, taxaJuros, periodo);

        System.out.printf("Valor final do investimento: R$ %.2f%n", valorFinal);

        scanner.close();
    }

    static double jurosCompostos(double valorInicial, double taxaJuros, int periodo) {
        // Calcular o valor final com juros compostos
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        return valorFinal;
    }
}

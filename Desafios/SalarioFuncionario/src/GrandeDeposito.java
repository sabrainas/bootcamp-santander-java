import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = 0.0;

            valor = scanner.nextDouble();

            if (valor > 0) {
                // Imprimir a mensagem de sucesso, formatando o saldo atual com duas casas decimais
                System.out.printf("Deposito realizado com sucesso!\nSaldo atual: R$ %.2f%n", valor);
            } else if (valor < 0) {
                // Imprimir a mensagem de valor inválido
                System.out.println("Valor invalido! Digite um valor maior que zero.");
            } else {
                // Imprimir a mensagem de encerrar o programa
                System.out.println("Encerrando o programa...");
            }
        scanner.close();
    }
}

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        //le os valores de entrada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salario bruto: ");
        float salario = scanner.nextFloat();
        System.out.println("Digite o valor dos beneficios: ");
        float beneficios = scanner.nextFloat();

        float valorImposto = 0;
        if(salario >= 0 && salario <= 1100){
            valorImposto = 0.05F * salario;
        }else if(salario > 1100 && salario <= 2500){
            valorImposto = 0.10F * salario;
        }else{
            valorImposto = 0.15F * salario;
        }

        float saida = salario - valorImposto + beneficios;
        System.out.println("O valor a ser repassado: " + saida);

        scanner.close();
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro:");
        int parametro1 = scanner.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int parametro2 = scanner.nextInt();

        try{
            contar(parametro1, parametro2);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        scanner.close();
    }

    public static void contar(int num1, int num2)throws ParametrosInvalidosException{
        if(num1 > num2){
            throw new ParametrosInvalidosException();
        }else{
            int contagem = num2 - num1;
            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}

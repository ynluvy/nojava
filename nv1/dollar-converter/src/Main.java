import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em reais (R$): ");
        double valorReais = scanner.nextDouble();

        double valorDolar = valorReais / 5.0;

        System.out.printf("O valor em dólares (USD) é: %.2f%n", valorDolar);
        scanner.close();
    }
}
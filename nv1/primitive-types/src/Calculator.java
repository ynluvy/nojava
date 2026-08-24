import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /):");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean valido = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    valido = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                valido = false;
        }

        if (valido) {
            System.out.println("O resultado é: " + resultado);
        }

        scanner.close();
    }
}

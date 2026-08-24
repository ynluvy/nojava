import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double numero = scanner.nextDouble();

        for (int i = 1; i <= 10; i++) {
            double resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        System.out.println("Tabuada de " + numero + " concluída!");
    }
}
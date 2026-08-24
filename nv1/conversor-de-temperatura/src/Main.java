import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma teperatura para converter em Celsius:");
        System.out.println("1 - Fahrenheit");
        System.out.println("2 - Kelvin");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite a temperatura em celsius:");
                double celsiusF = scanner.nextDouble();
                double fahrenheit = (celsiusF * 9/5) + 32;
                System.out.println(celsiusF + "°C é igual a " + fahrenheit + "°F");
                break;
            case 2:
                System.out.println("Digite a temperatura em celsius:");
                double celsiusK = scanner.nextDouble();
                double kelvin = celsiusK + 273.15;
                System.out.println(celsiusK + "°C é igual a " + kelvin + "K");
                break;
            default:
                System.out.println("Opção inválida.");
        }
        scanner.close();
    }
}
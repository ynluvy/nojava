import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=====================================");

            System.out.println("Bem-vindo ao Menu interativo!");

            System.out.println("=====================================");

            System.out.println("Escolha uma opção:");
            System.out.println("1. Clima");
            System.out.println("2. Localização");
            System.out.println("3. Noticia do dia");
            System.out.println("4. Sair");

            System.out.println("Digite o número da opção desejada:");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("=====================================");
                    System.out.println("Dia de hoje está ensolarado com temperaturas altas.");
                    System.out.println("=====================================");
                    break;
                case 2:
                    System.out.println("=====================================");
                    System.out.println("Quarto.");
                    System.out.println("=====================================");
                    break;
                case 3:
                    System.out.println("=====================================");
                    System.out.println("Nada de especial hoje.");
                    System.out.println("=====================================");
                    break;
                case 4:
                    System.out.println("=====================================");
                    System.out.println("Saindo do programa. Até logo!");
                    System.out.println("=====================================");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();

            System.out.println("Digite o curso do aluno:");
            String curso = scanner.nextLine();

            System.out.println("Digite a nota do aluno:");
            double nota1 = scanner.nextDouble();

            System.out.println("Digite a nota do aluno:");
            double nota2 = scanner.nextDouble();

            System.out.println("Digite a nota do aluno:");
            double nota3 = scanner.nextDouble();

            System.out.println("Digite a nota do aluno:");
            double nota4 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            System.out.println("Aluno: " + nome);
            System.out.println("Média: " + media);
            System.out.println("Curso: " + curso);

            if (media >= 7) {
                System.out.println("Situação: Aprovado");
            } else if (media >= 5) {
                System.out.println("Situação: Recuperação");
            } else {
                System.out.println("Situação: Reprovado");
            }

            System.out.println("Deseja calcular a média de outro aluno? (s/n)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
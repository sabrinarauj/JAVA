import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;
        double nota = 0;
        double media = 0;
        int qtd = 0;

        do {
            try {
                System.out.println("Digite a nota do " + (qtd + 1) + "aluno ou um valor negativo para sair: ");
                nota = Double.parseDouble(scanner.nextLine());
                if (nota >= 0) {
                    somaNotas += nota;
                    qtd++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor numérico válido");
            }
        } while (nota >= 0);

        try {
            media = somaNotas / qtd;
            System.out.println("Média"+media);
        }catch (ArithmeticException e) {
            System.out.println("Não foi inserido nenhum aluno para calcular a média");
        }
    }
}
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        double soma;
        double sub = 0;
        double multi = 0;
        double div = 0;
        double potencia = 0;
        double raiz = 0;
        double n1 = 0;
        double n2 = 0;

        do {
            try {
                System.out.println("Digite o primeiro número: ");
                n1 = Double.parseDouble(scanner.nextLine());

                System.out.println("Digite o segundo número: ");
                n2 = Double.parseDouble(scanner.nextLine());

                System.out.println("Qual operação deseja realizar?");
                System.out.println("1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão | 5 - Raiz Quadrada | 6 - Potência");
                escolha = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Você digitou um valor inválido");
            }
            if (escolha == 1) {
                soma = n1 + n2;
                System.out.println("Resultado: " + soma);

            } else if (escolha == 2) {
                sub = n1 - n2;
                System.out.println("Resultado: " + sub);

            } else if (escolha == 3) {
                multi = n1 * n2;
                System.out.println("Resultado: " + multi);

            } else if (escolha == 4) {
                try {
                    div = n1 / n2;
                    System.out.println("Resultado: " + div);
                } catch (ArithmeticException e) {
                    System.out.println("Não é possível dividir por zero");
                }

            } else if (escolha == 5) {
                raiz = Math.pow(n1, 1.0/n1);
                System.out.println("Resultado: "+raiz);

            } else if (escolha == 6) {
                potencia = Math.pow(n1, n2);
                System.out.println("Resultado: "+potencia);
            }
        } while (n1 >= 0 || n2 >= 0);
    }
}

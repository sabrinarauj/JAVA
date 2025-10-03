import java.util.Objects;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n1 = 0;
        double n2 = 0;
        double conta = 0;
        String operador = "";
        String opcao = "";

        System.out.println("Deseja realizar uma conta? ");
        System.out.println("Sim | Sair");
        opcao = scanner.nextLine();

        do {
            System.out.println("Digite um número: ");
            n1 = Double.parseDouble(scanner.nextLine());

            System.out.println("Digite um operador matemático: + | - | * | /");
            operador = scanner.nextLine();

            System.out.println("Agora, digite mais um número: ");
            n2 = Double.parseDouble(scanner.nextLine());

        } while (Objects.equals(opcao, "Sim"));

        if (Objects.equals(operador, "+")) {
            conta = (n1 + n2);
            System.out.println("Resultado: "+conta);

        } else if (Objects.equals(operador, "-")) {
            conta = (n1 - n2);
            System.out.println("Resultado: "+conta);

        } else if (Objects.equals(operador, "*")) {
            conta = (n1 * n2);
            System.out.println("Resultado: "+conta);

        } else {
            conta = (n1 / n2);
            System.out.println("Resultado: "+conta);
        }
    }
}

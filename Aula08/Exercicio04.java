import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String numeroTelefone = "";

            System.out.println("--- Validador de telefone (celular e fixo) ---");

            System.out.println("Digite o telefone que deseja validar: ");
            numeroTelefone = scanner.nextLine();

            if (numeroTelefone.length() < 9) {
                throw new ArithmeticException("O telefone deve ter 9 dígitos");
            }
            if (numeroTelefone.contains("--")) {
                throw new NumberFormatException("Telefone inválido");
            }
            if (numeroTelefone.contains("))")) {
                throw new NumberFormatException("Telefone inválido");
            }
            System.out.println("Telefone válido: " + numeroTelefone);
    }
}
//01234567891123
//(19)98812-7198
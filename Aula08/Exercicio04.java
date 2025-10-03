import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            String numeroTelefone = "";

            System.out.println("--- Validador de telefone (celular e fixo) ---");
            System.out.println("Digite o telefone que deseja validar: ");
            numeroTelefone = scanner.nextLine();

            if (numeroTelefone.matches("^\\d{2}+\\d{5}+-{4}$")) {
                System.out.println("Telefone válido!");
            }
            else if (numeroTelefone.substring(0,2).contains(")")) {
                throw new NumberFormatException("Formato de telefone inválido");
            }
            else if (numeroTelefone.length() < 9 || numeroTelefone.isBlank()) {
                throw new NumberFormatException("Formato de telefone inválido");
            }
            else if (numeroTelefone.contains("--")) {
                throw new NumberFormatException("Formato de telefone inválido");
            }
            else if (numeroTelefone.contains("))")) {
                throw new NumberFormatException("Formato de telefone inválido");
            }
            else if (numeroTelefone.matches("^\\s")) {
               throw new NumberFormatException("Formato de telefone inválido");
            }
            else {
                System.out.println("Telefone válido: " + numeroTelefone);
            }
    }
}
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// ameacei fazer um regex aqui
public class Exercicio04_Regex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regexTelefone = "^/d{2}+/d{5}+-/d{4}$";
        String numeroTelefone = "";

        System.out.println("Digite o número do telefone: ");
        numeroTelefone = scanner.nextLine();

        Pattern padraoTelefone = Pattern.compile(regexTelefone);
        Matcher matcher = padraoTelefone.matcher(numeroTelefone);

        if (matcher.matches()) {
            System.out.println("O telefone é válido");
        } else {
            System.out.println("O telefone é inválido");
        }
    }
}

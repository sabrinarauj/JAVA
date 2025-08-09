import java.util.Objects;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String identificador;

       while (true) {
           System.out.println("Digite o identificador de programação ou sair: ");
           identificador = scanner.nextLine();

           if (identificador.equalsIgnoreCase("sair")) {
               System.out.println("Encerrado");
               break;
           }

           if (identificador.contains("_")) {
               System.out.println("snake_case");
           } else if (Character.isUpperCase(identificador.charAt(0))) {
               System.out.println("PascalCase");
           } else {
               System.out.println("camelCase");
           }
       }
    }
}
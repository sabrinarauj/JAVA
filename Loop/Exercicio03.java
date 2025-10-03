import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contar_palavras = 1;
        String frase;

        System.out.println("Digite uma frase: ");
        frase = scanner.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contar_palavras++;
            }
        }
        System.out.println("Palavras: "+ contar_palavras);
    }
}

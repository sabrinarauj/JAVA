import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Digite um número: ");
        num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }
    }
}
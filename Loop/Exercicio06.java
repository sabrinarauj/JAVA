import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mdc = 0;
        int n1;
        int n2;

        System.out.println("Digite um número: ");
        n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite mais um número: ");
        n2 = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 %i == 0 && n2 %i == 0){
                mdc = i;
            }
        }
        System.out.println("MDC: " + mdc);
    }
}
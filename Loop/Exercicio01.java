import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite um número ou 0 para sair: ");
            int num = Integer.parseInt(scanner.nextLine());

            if (num == 0) break;

            if (num %3 == 0 && num %5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (num %3 == 0) {
                System.out.println("Fizz");
            } else if (num %5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
    }
}
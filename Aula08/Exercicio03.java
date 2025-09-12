import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoDisponivel = 1000;
        double saldoAtual;
        double valorSaque;
        double deposito;
        String nome = "";
        int escolha = 0;

        System.out.println("--- Caixa Econômica Federal ---");
        System.out.println("Bem-vindo, usuário(a). Para começar, digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Bem-vindo(a) "+nome+"!");

        try {
            System.out.println(nome + ", " + "qual operação deseja realizar hoje?");
            System.out.println("1 - Consultar saldo | 2 - Realizar saque | 3 - Fazer depósito");
            escolha = Integer.parseInt(scanner.nextLine());

        } catch (NumberFormatException e) {
            System.out.println("Você digitou um valor inválido");
        }

        switch (escolha) {
            case 1:
                System.out.println("Saldo disponível: "+saldoDisponivel);
                break;

            case 2:
                System.out.println("Digite o valor que deseja sacar: ");
                valorSaque = Double.parseDouble(scanner.nextLine());

                if (valorSaque > saldoDisponivel) {
                    System.out.println(nome + " seu saldo é insuficiente");

                } else {
                    saldoAtual = saldoDisponivel - valorSaque;
                    if (saldoAtual < 0) {
                        throw new ArithmeticException("Seu saldo não pode ficar negativo");
                    }
                    System.out.println("Saque realizado com sucesso! Seu saldo atual é de: " + saldoAtual);
                }
                break;

            case 3:
                System.out.println("Digite o valor do depósito: ");
                deposito = Double.parseDouble(scanner.nextLine());

                saldoAtual = deposito + saldoDisponivel;
                System.out.println("Depósito feito com sucesso! Seu saldo atual é de: "+saldoAtual);
                break;
        }
    }
}

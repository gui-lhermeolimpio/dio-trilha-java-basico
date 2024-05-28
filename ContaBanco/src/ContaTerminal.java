import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in). useLocale(Locale.UK)) {
            // solicitando dados ao usuário
            System.out.println("Por favor, digite o número da Agência: ");
            int numAgencia = sc.nextInt();

            System.out.println("Insira o código de sua Agência: ");
            String codAgencia = sc.next();

            System.out.println("Insira seu nome: ");
            sc.nextLine();
            String nomeCliente = sc.nextLine();

            System.out.println("Insira o seu saldo bancário: ");
            float saldoCliente = sc.nextFloat();


            // printando dados do usuário.
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + codAgencia + " conta " + numAgencia + " e seu saldo " + saldoCliente + " já está disponível para saque!");
        }
    }
}

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da conta ! " );
        int numeroDaConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o numero da agencia ");
        String numeroDaAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome " );
        String nomeDoCliente= scanner.nextLine();

        System.out.println("Por favor, digite o saldo ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroDaAgencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
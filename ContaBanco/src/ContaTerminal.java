import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String NomeCliente;
        float saldo;

        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da sua agência:");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome:");
        NomeCliente = scanner.next();


        System.out.println("Por favor, digite o seu saldo(R$):");
        saldo = scanner.nextFloat();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %f já está disponível para saque!",NomeCliente, agencia, numero, saldo );


    }
}
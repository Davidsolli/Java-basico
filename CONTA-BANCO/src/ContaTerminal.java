import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número de sua conta: ");
        Integer numero = sc.nextInt();

        System.out.println("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.next();

        System.out.println("Digite seu saldo em conta: ");
        while (!sc.hasNextFloat()) {
            System.out.println("Por favor, insira um valor válido para o saldo.");
            sc.next();
        }
        float saldo = sc.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
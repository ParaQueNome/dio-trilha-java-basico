import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Informe o número da Agência: ");
        ContaTerminal conta = new ContaTerminal();
        
        Scanner scanner = new Scanner(System.in);
        String agencia = scanner.nextLine();
        conta.setAgencia(agencia);

        System.out.println("Informe o nÚmero da Conta: ");
        int numero = scanner.nextInt();
        conta.setNumero(numero);

        System.out.println("Informe o Saldo: ");
        double saldo = scanner.nextDouble();
        conta.setSaldo(saldo);
        
        System.out.println("Informe seu nome: ");
        String nome = scanner.next();
        conta.setNome(nome);


        scanner.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.0f,00 já está disponível", nome, agencia, numero, saldo);
    }

}

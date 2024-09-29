import java.util.Scanner;

public class ContaTerminal { // O arquivo deve ser salvo como ContaTerminal.java
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();

        Banco banco = new Banco(conta, agencia, nomeCliente, saldo);

        System.out.println("Dados cadastrados: " + banco.toString());

        System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta  em nosso banco, sua agencia é: "+ agencia + "," + "conta:" + conta + " e seu saldo é: " +  saldo + " já está disponivel.");
        
        scanner.close();
    }
}
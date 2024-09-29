class Banco {

    int conta;
    String agencia;
    String nomeCliente;
    double saldo;

    // Construtor da classe
    public Banco(int conta, String agencia, String nomeCliente, double saldo) {
        this.conta = conta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente: " + nomeCliente + "\nAgência: " + agencia + "\nConta: " + conta + "\nSaldo: " + saldo;
    }
}
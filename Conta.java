public class Conta {
    private int numero;
    private Cliente cliente;
    private double saldo;

    public Conta(int numero, Cliente cliente, double saldoInicial) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}


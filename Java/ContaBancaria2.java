public class ContaBancaria2 {
    private double saldo;

    public ContaBancaria2(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void sacar(double quantia) throws SaldoInsuficienteException {
        if (quantia > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de R$" + quantia + ".");
        }
        saldo -= quantia;
        System.out.println("Saque de R$" + quantia + " realizado. Saldo restante: R$" + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

}
public class ContaBancaria {
    private float saldo;
    private String titular;

    public ContaBancaria(float saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
    }

    public void  setSaldo(float saldo){
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void  setTitular(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(int adicionar){
        this.saldo += adicionar;
    }

    public void sacar(int retirar){
        this.saldo += retirar;
    }

    public void mostrarSaldo(){
        System.out.println("O saldo atual é de: "+ this.saldo);
    }



}

/**
 * Conta
 */
public abstract class Conta {
    private static final String AGENCIA_PADRAO = "0001";
    private static int SEQUENTIAL = 1;

    protected double saldo;
    protected String agencia;
    protected int numero;
    protected String tipoConta = "Conta";

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENTIAL++;
        this.saldo = 0;
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void transferir(double valor, Conta destinatario) {
        this.sacar(valor);
        destinatario.depositar(valor);
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void imprimirExtrato() {
        System.out.println("Extrato " + tipoConta);
        System.out.println("Agencia-numero: " + this.agencia + "-" + this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
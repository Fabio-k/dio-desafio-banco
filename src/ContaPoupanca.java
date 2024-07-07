public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.tipoConta = "Conta poupança";
    }
}

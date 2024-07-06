public class App {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new ContaCorrente();
        Conta conta2 = new ContaPoupanca();

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}

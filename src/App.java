public class App {
    public static void main(String[] args) throws Exception {
        Cliente pessoa = new Cliente();
        pessoa.setNome("fabio");
        Conta conta1 = new ContaCorrente(pessoa);
        Conta conta2 = new ContaPoupanca(pessoa);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
    }
}

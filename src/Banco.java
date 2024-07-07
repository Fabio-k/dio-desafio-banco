import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;
    private Double saldo;
    private List<Acao> acoes;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.acoes = new ArrayList<>();
        this.saldo = (double) 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public void addMoney(double money) {
        this.saldo += money;
    }
}

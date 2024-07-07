import java.util.ArrayList;
import java.util.List;

public class CarteiraDeAcoes {
    private List<AcaoUser> acoes = new ArrayList<>();

    public void comprarAcao(Conta conta, Acao acao, int qtd, Banco banco) {
        Double price = acao.getPreco() * qtd;

        for (AcaoUser userAcao : acoes) {
            if (userAcao.getTicker() == acao.getTicker()) {
                if (conta.saldo > price) {
                    conta.saldo -= price;
                    banco.addMoney(price);
                    userAcao.addValorPagoQtd(acao.getPreco(), qtd);

                }

            }

        }
    }

    private AcaoUser addAcaoToUser(Acao acao, Integer qtd) {
        AcaoUser acaoUser = new AcaoUser();
        acaoUser.setTicker(acao.getTicker());
        acaoUser.addValorPagoQtd(acao.getPreco(), qtd);
        return acaoUser;
    }

}

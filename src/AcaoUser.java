public class AcaoUser {
    private String ticker;
    private int quantidade;
    private double precoTotal;

    public AcaoUser() {
        this.precoTotal = 0;
        this.quantidade = 0;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void addValorPagoQtd(double valor, int qtd) {
        this.precoTotal += valor;
        this.quantidade += qtd;
    }

    public Double custoMedio() {
        return precoTotal / quantidade;
    }

}

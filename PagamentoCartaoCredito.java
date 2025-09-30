public class PagamentoCartaoCredito implements IPagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    @Override
    public boolean processarPagamento(double valor) {
        if (valor < 200.0) {
            System.out.println("Pagamento  aprovado, Valor: " + valor);
            return true;
        } else {
            System.out.println("Pagamento recusado, Valor: " + valor);
            return false;
        }
    }
}

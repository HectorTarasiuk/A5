public class PagamentoBoleto implements IPagamento {
    private String codigoBarras;

    public PagamentoBoleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor < 1000.0) {
            System.out.println("Pagamento aprovado; valor: " + valor);
            return true;
        } else {
            System.out.println("Pagamento recusado; valor: " + valor);
            return false;
        }
    }
}

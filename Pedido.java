import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDate data;
    private String status;
    private Cliente cliente; 
    private List<ItemPedido> itens; 
    private IPagamento metodoPagamento;

    public Pedido(int numero, LocalDate data, String status, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.status = status;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(Produto produto, int quantidade) {
        ItemPedido item = new ItemPedido(produto, quantidade);
        itens.add(item);
    }
    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }
    public void setMetodoPagamento(IPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
     public boolean realizarPagamento() {
        if (metodoPagamento == null) {
            System.out.println("Nenhum metodo de pagamento escolhido!");
            return false;
        }
        double total = calcularTotal();
        return metodoPagamento.processarPagamento(total);
    }
    public Cliente getCliente() {
        return cliente;
    }
}

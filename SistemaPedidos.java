import java.time.LocalDate;

public class SistemaPedidos {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Fortrek Teclado Gamer BLACK EAGLE", 50.0);
        Produto produto2 = new Produto("Mouse Pad Preto", 100.00);
        Produto produto3 = new Produto("Mouse Dell sem fio - WM118", 250.0);

        ClientePF cliente1 = new ClientePF("Jaqueline Costa Mole", "jcosta@gmail.com", "20335132");
        ClientePJ cliente2 = new ClientePJ("Ipiranga LTDA", "ipira@gmail.com", "66565115");

        Pedido pedido1 = new Pedido(1, LocalDate.now(), "aberto", cliente1);
        pedido1.adicionarItem(produto1, 1);
        pedido1.adicionarItem(produto2, 1);
        pedido1.setMetodoPagamento(new PagamentoCartaoCredito("5132-5678-9999-0000"));
        System.out.println("Pedido 1 pagamento: " + pedido1.realizarPagamento());

        Pedido pedido2 = new Pedido(2, LocalDate.now(), "aberto", cliente2);
        pedido2.adicionarItem(produto3, 2); 
        pedido2.setMetodoPagamento(new PagamentoCartaoCredito("8888-7777-6666-5555"));
        System.out.println("Pedido 2 pagamento: " + pedido2.realizarPagamento());

        Pedido pedido3 = new Pedido(3, LocalDate.now(), "aberto", cliente1);
        pedido3.adicionarItem(produto3, 3); 
        pedido3.adicionarItem(produto1, 1);
        pedido3.setMetodoPagamento(new PagamentoBoleto("0011223344556677"));
        System.out.println("Pedido 3 pagamento: " + pedido3.realizarPagamento());

        Pedido pedido4 = new Pedido(4, LocalDate.now(), "aberto", cliente2);
        pedido4.adicionarItem(produto3, 6); 
        pedido4.setMetodoPagamento(new PagamentoBoleto("9988776655443322"));
        System.out.println("Pedido 4 pagamento: " + pedido4.realizarPagamento());
    }
}

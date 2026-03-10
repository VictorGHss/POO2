package aula01_10_03_26.exemplo;

public class PedidoTeste {
    public static void main(String[] args) {
        Pedido pedido1 = new Pedido (1, "17/09/2001");
        pedido1.imprimirPedido();
        System.out.println("------------------");
        pedido1.setStatusPedido(Status.AGUARDANDO_PAGAMENTO);
        pedido1.imprimirPedido();
        System.out.println("------------------");
        pedido1.setStatusPedido(Status.PROCESSANDO);
        pedido1.imprimirPedido();
        System.out.println("------------------");
        pedido1.setStatusPedido(Status.ENVIADO);
        pedido1.imprimirPedido();
        System.out.println("------------------");
        pedido1.setStatusPedido(Status.ENTREGUE);
        pedido1.imprimirPedido();

    }
}

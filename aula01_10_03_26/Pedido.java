package aula01_10_03_26;

public class Pedido {
    private int id;
    private String data;
    private Status statusPedido;

    public Pedido(int id, String data) {
        this.id = id;
        this.data = data;
        this.statusPedido = Status.AGUARDANDO_PAGAMENTO;
    }

    public void imprimirPedido(){
        System.out.println("Codigo: " + this.id);
        System.out.println("Data: " + this.data);
        System.out.println("Status: " + this.statusPedido);
    }

    public void setStatusPedido(Status statusPedido) {
        this.statusPedido = statusPedido;
    }

}

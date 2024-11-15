package src;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        Pizzaria pizzaria = new Pizzaria();
        Entregador entregador = new Entregador();

        // Adiciona os observadores ao pedido
        pedido.addObserver(pizzaria);
        pedido.addObserver(entregador);

        // Simula as mudanças de status do pedido
        pedido.mudarParaPreparando();
        pedido.mudarParaPronto();
        pedido.mudarParaEntregando();
        pedido.mudarParaEntregue();
    }
}

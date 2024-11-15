package src;

class Entregador implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Entregador recebeu atualização: " + status);
    }
}


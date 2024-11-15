package src;

class Pizzaria implements Observer {
    @Override
    public void update(String status) {
        System.out.println("Pizzaria recebeu atualização: " + status);
    }
}


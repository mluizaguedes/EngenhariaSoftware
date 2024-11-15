package src;

import java.util.List;
import java.util.ArrayList;

class Pedido {
    private String preparando = "Pedido está sendo preparado";
    private String pronto = "Pedido está pronto";
    private String entregando = "Pedido está a caminho";
    private String entregue = "Pedido foi entregue";
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public String getPreparando() {
        return preparando;
    }

    public String getPronto() {
        return pronto;
    }

    public String getEntregando() {
        return entregando;
    }

    public String getEntregue() {
        return entregue;
    }

    public void notifyObservers(String status) {
        for (Observer observer : observers) {
            observer.update(status);
        }
    }

    // Métodos para simular mudança de status e notificar observadores
    public void mudarParaPreparando() {
        notifyObservers(preparando);
    }

    public void mudarParaPronto() {
        notifyObservers(pronto);
    }

    public void mudarParaEntregando() {
        notifyObservers(entregando);
    }

    public void mudarParaEntregue() {
        notifyObservers(entregue);
    }
}

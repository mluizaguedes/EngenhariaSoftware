import java.util.ArrayList;
import java.util.List;

public class Chatbot {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void receiveMessage(String message) {
        System.out.println("Chatbot received a message: " + message);
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

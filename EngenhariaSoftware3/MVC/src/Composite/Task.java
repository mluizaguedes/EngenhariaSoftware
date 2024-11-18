package EngenhariaSoftware3.MVC.src.Composite;

import EngenhariaSoftware3.MVC.src.Observer.User;
import java.util.ArrayList;
import java.util.List;

public class Task implements ProjectComponent {
    private String name;
    private List<User> observers = new ArrayList<>();

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void add(ProjectComponent component) {
        throw new UnsupportedOperationException("Tarefas não podem conter subcomponentes.");
    }

    @Override
    public void remove(ProjectComponent component) {
        throw new UnsupportedOperationException("Tarefas não podem conter subcomponentes.");
    }

    @Override
    public void notifyObservers(String message) {
        for (User observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void attachObserver(User observer) {
        observers.add(observer);
    }

    @Override
    public void detachObserver(User observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }
}

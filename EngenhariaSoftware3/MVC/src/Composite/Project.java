package EngenhariaSoftware3.MVC.src.Composite;

import EngenhariaSoftware3.MVC.src.Observer.User;
import java.util.ArrayList;
import java.util.List;

public class Project implements ProjectComponent {
    private String name;
    private List<ProjectComponent> components = new ArrayList<>();
    private List<User> observers = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    @Override
    public void add(ProjectComponent component) {
        components.add(component);
    }

    @Override
    public void remove(ProjectComponent component) {
        components.remove(component);
    }

    @Override
    public void notifyObservers(String message) {
        for (User observer : observers) {
            observer.update(message);
        }
        for (ProjectComponent component : components) {
            component.notifyObservers(message);
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

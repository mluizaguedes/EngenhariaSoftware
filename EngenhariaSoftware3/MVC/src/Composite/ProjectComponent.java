package EngenhariaSoftware3.MVC.src.Composite;

import EngenhariaSoftware3.MVC.src.Observer.User;

public interface ProjectComponent {
    void add(ProjectComponent component);
    void remove(ProjectComponent component);
    void notifyObservers(String message);
    void attachObserver(User observer);
    void detachObserver(User observer);
}


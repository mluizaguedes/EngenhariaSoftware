package EngenhariaSoftware3.MVC.src.Observer;

import EngenhariaSoftware3.MVC.src.Strategy.Notification;

public class TeamMember implements User {
    private String name;
    private Notification strategy;

    public TeamMember(String name, Notification strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    @Override
    public void update(String message) {
        strategy.sendNotification(name, message);
    }
}

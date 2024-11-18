package EngenhariaSoftware3.MVC.src.Strategy;

public class SMSNotification implements Notification {
    @Override
    public void sendNotification(String userName, String message) {
        System.out.println("Enviando SMS para " + userName + ": " + message);
    }
}

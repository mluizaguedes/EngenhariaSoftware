package EngenhariaSoftware3.MVC.src.Strategy;

public class EmailNotification implements Notification {
    @Override
    public void sendNotification(String userName, String message) {
        System.out.println("Enviando e-mail para " + userName + ": " + message);
    }
}

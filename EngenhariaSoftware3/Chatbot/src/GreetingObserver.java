public class GreetingObserver implements Observer {
    @Override
    public void update(String message) {
        if (message.toLowerCase().contains("hello") || message.toLowerCase().contains("hi")) {
            System.out.println("GreetingObserver: Hello! How can I assist you today?");
        }
    }
}

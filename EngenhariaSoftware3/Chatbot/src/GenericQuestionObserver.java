public class GenericQuestionObserver implements Observer {
    @Override
    public void update(String message) {
        if (message.toLowerCase().contains("how are you")) {
            System.out.println("GenericQuestionObserver: I'm a bot, but thanks for asking! How can I help?");
        } else if (message.toLowerCase().contains("help")) {
            System.out.println("GenericQuestionObserver: Sure, I'm here to help! Please ask me your questions.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Chatbot chatbot = new Chatbot();

        // Adiciona diferentes observadores
        chatbot.addObserver(new GreetingObserver());
        chatbot.addObserver(new TimeObserver());
        chatbot.addObserver(new GenericQuestionObserver());

        // Testa o chatbot com diferentes mensagens
        chatbot.receiveMessage("Hello, bot!");
        chatbot.receiveMessage("Can you tell me the time?");
        chatbot.receiveMessage("How are you?");
        chatbot.receiveMessage("I need some help");
    }
}

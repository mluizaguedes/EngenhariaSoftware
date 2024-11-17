/* import org.telegram.telegrambots.client.okhttp.OkHttpTelegramClient;
import org.telegram.telegrambots.longpolling.util.LongPollingSingleThreadUpdateConsumer;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.generics.TelegramClient;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MovieBot implements LongPollingSingleThreadUpdateConsumer {
    private final TelegramClient telegramClient;
    private final Map<String, Consumer<Long>> commandHandlers = new HashMap<>();

    public MovieBot(String botToken) {
        telegramClient = new OkHttpTelegramClient(botToken);
        registerHandlers(); // Registrar comandos ao inicializar o bot
    }

    @Override
    public void consume(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String messageText = update.getMessage().getText();
            long chatId = update.getMessage().getChatId();

            // Tentar encontrar um comando registrado para o texto da mensagem
            commandHandlers.getOrDefault(messageText, this::defaultHandler).accept(chatId);
        }
    }

    private void registerHandlers() {
        // Comando: /start
        commandHandlers.put("/start", chatId -> sendMessage(chatId, "Bem-vindo ao MovieBot! Digite /help para ver os comandos disponíveis."));

        // Comando: /help
        commandHandlers.put("/help", chatId -> sendMessage(chatId, """
            Aqui estão os comandos disponíveis:
            /start - Inicia o bot
            /top - Mostra os filmes mais bem avaliados
            /random - Recomenda um filme aleatório
            /about - Sobre o MovieBot
            """));

        // Comando: /top
        commandHandlers.put("/top", chatId -> sendMessage(chatId, "Top 5 Filmes:\n1. O Poderoso Chefão\n2. Um Sonho de Liberdade\n3. A Origem\n4. Interestelar\n5. O Senhor dos Anéis"));

        // Comando: /random
        commandHandlers.put("/random", chatId -> sendMessage(chatId, "Recomendação aleatória: Clube da Luta"));

        // Comando: /about
        commandHandlers.put("/about", chatId -> sendMessage(chatId, "O MovieBot é um bot que recomenda filmes e ajuda você a descobrir novos favoritos!"));
    }

    private void defaultHandler(Long chatId) {
        sendMessage(chatId, "Comando não reconhecido. Digite /help para ver os comandos disponíveis.");
    }

    private void sendMessage(long chatId, String text) {
        SendMessage message = SendMessage.builder()
                .chatId(chatId)
                .text(text)
                .build();
        try {
            telegramClient.execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
 */
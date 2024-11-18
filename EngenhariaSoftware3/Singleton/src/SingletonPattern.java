public class SingletonPattern {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // Usar o Logger para registrar mensagens
        logger.log("Aplicação iniciada.");
        logger.log("Processando dados...");
        logger.log("Aplicação finalizada.");
    }
}

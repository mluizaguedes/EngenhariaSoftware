package src;

// Classe Comida que usa Fritura
public class Comida {
    private Fritura fritura;

    // Método para configurar o tipo de fritura
    public void setFritura(Fritura fritura) {
        this.fritura = fritura;
    }

    // Método para executar a fritura
    public void fazerFritura() {
        if (fritura != null) {
            fritura.fritar();
        } else {
            System.out.println("Nenhum tipo de fritura selecionado!");
        }
    }
}
package src;

public class Main {
    public static void main(String[] args) {
        Comida frango = new Comida();

        frango.setFritura(new Empanado());
        frango.fazerFritura(); 

    }
}
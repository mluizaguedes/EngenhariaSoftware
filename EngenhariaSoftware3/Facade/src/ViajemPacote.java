// Facade
public class ViajemPacote {
    private VooReserva vooReserva;
    private HotelReserva hotelReserva;
    private CarroReserva carroReserva;

    public ViajemPacote() {
        vooReserva = new VooReserva();
        hotelReserva = new HotelReserva();
        carroReserva = new CarroReserva();
    }

    public void fecharPacote() {
        System.out.println("Vamos reservar tudo para a sua viajem...");
        vooReserva.vooReserva();
        hotelReserva.hotelReserva();
        carroReserva.carroReserva();
        System.out.println("Pacote de viajem fechado com sucesso.");
    }
}

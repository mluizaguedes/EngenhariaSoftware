import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeObserver implements Observer {
    @Override
    public void update(String message) {
        if (message.toLowerCase().contains("time")) {
            String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
            System.out.println("TimeObserver: The current time is " + currentTime);
        }
    }
}

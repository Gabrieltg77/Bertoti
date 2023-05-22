import java.util.*;

public class WeatherStation {
    public static void main(String[] args) {
        Model model = Model.getInstance();
        Controller controller = new Controller(model);

        // Simulate temperature and humidity changes
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                model.setMeasurements("50", "90", "29.0");
            }
        }, 5000);

        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            public void run() {
                model.setMeasurements("49", "80", "27.3");
            }
        }, 30000);
    }
}
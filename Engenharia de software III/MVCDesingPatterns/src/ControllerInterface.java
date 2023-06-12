
import java.util.List;

public interface ControllerInterface {
    void addTask(String taskName, double paymentAmount);
    void completeTask(String taskName);
    List<String> getTasks();
}
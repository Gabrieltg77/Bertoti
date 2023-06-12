
import java.util.List;

// Facade Pattern: ControllerInterface
public interface TaskManager extends Subject {
    void addTask(String taskName, double paymentAmount);
    void completeTask(String taskName);
    List<String> getTasks();
}

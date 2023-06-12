import java.util.List;

public class TaskManagerFacade {
    private TaskManager taskManager;
    private Controller controller;

    public TaskManagerFacade() {
        taskManager = new TaskManagerImpl();
        controller = new Controller(taskManager);
    }

    public void addTask(String taskName, double paymentAmount) {
        controller.addTask(taskName, paymentAmount);
    }

    public void completeTask(String taskName) {
        controller.completeTask(taskName);
    }

    public List<String> getTasks() {
        return controller.getTasks();
    }
}
import java.util.List;

public class Controller implements ControllerInterface {
    private TaskManager taskManager;
    private TaskManagerView view;

    public Controller(TaskManager taskManager) {
        this.taskManager = taskManager;
        this.view = new TaskManagerView(this);
        view.createView();
    }

    @Override
    public void addTask(String taskName, double paymentAmount) {
        taskManager.addTask(taskName, paymentAmount);
    }

    @Override
    public void completeTask(String taskName) {
        taskManager.completeTask(taskName);
    }

    @Override
    public List<String> getTasks() {
        return taskManager.getTasks();
    }
}

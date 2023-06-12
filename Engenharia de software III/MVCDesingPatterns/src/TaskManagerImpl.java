import java.util.ArrayList;
import java.util.List;

public class TaskManagerImpl implements TaskManager {
    private static TaskManagerImpl instance;
    private List<String> tasks;
    private List<Observer> observers;

    TaskManagerImpl() {
        tasks = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public static TaskManagerImpl getInstance() {
        if (instance == null) {
            instance = new TaskManagerImpl();
        }
        return instance;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void addTask(String taskName, double paymentAmount) {
        tasks.add(taskName);
        notifyObservers();
        PaymentStrategy paymentStrategy;
        if (paymentAmount <= 100) {
            paymentStrategy = new DebitPayment();
        } else {
            paymentStrategy = new CreditPayment();
        }
        paymentStrategy.pay(paymentAmount);
        System.out.println("Task added: " + taskName);
    }

    @Override
    public void completeTask(String taskName) {
        tasks.remove(taskName);
        notifyObservers();
        System.out.println("Task completed: " + taskName);
    }

    @Override
    public List<String> getTasks() {
        return tasks;
    }
}

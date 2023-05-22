
import java.util.ArrayList;
import java.util.List;

public class Contactor implements Subject{
    private int valor;
    private final List<Observer> observances = new ArrayList<>();

    public int getValor() {
        return valor;
    }

    public void incrementer() {
        valor++;
        notificarObservadores();
    }

    @Override
    public void registrarObservador(Observer observer) {
        observances.add(observer);
    }

    @Override
    public void removerObservador(Observer observer) {
        observances.remove(observer);
    }

    @Override
    public void notificarObservadores() {
        for (Observer observer : observances) {
            observer.update(valor);
        }
    }
}

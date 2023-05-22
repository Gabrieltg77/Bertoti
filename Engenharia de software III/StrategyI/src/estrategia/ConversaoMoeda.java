package estrategia;

public class ConversaoMoeda {
    private Conversor conversor;

    public ConversaoMoeda(Conversor conversor) {
        this.conversor = conversor;
    }

    public double converter(double valor) {
        return conversor.converter(valor);
    }
}
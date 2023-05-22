package estrategia;
public class ConversorDolarReal implements Conversor {
    private double taxaCambio;

    public ConversorDolarReal(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor * taxaCambio;
    }
}

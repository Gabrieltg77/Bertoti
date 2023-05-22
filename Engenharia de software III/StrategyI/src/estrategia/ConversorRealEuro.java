package estrategia;
public class ConversorRealEuro implements Conversor {
    private double taxaCambio;

    public ConversorRealEuro(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor / taxaCambio;
    }
}

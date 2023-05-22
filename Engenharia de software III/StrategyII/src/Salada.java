import java.util.List;
import java.util.ArrayList;

public class Salada {
    private List<Cortar> ingredientes;

    public Salada(List<Cortar> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void preparar() {
        for (Cortar ingrediente : ingredientes) {
            ingrediente.cortar();
        }
    }

    public static void main(String[] args) {
        List<Cortar> ingredientes = new ArrayList<>();
        ingredientes.add(new Cenoura());
        ingredientes.add(new Cebola());

        Salada salada = new Salada(ingredientes);
        salada.preparar();
    }
}

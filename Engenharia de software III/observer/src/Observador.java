

public class Observador implements Observer {
    private String nome;

    public Observador(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(int valor) {
        System.out.println(nome + " foi notificado: novo valor = " + valor);
    }
}

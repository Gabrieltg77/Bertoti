
public class Main {
    public static void main(String[] args) {
                Contactor contador = new Contactor();
                Observador observador1 = new Observador("Observador 1");
                Observador observador2 = new Observador("Observador 2");

                contador.registrarObservador(observador1);
                contador.registrarObservador(observador2);

                contador.incrementer(); // notifica os observadores

                contador.removerObservador(observador1);

                contador.incrementer(); // notifica somente o observador2
            }
        }
package estrategia;

public class Main {
    public static void main(String[] args) {
        ConversorRealEuro conversorRealEuro = new ConversorRealEuro(5.0);
        ConversaoMoeda conversaoMoeda = new ConversaoMoeda(conversorRealEuro);

        double valorEmReal = 100.0;
        double valorEmEuro = conversaoMoeda.converter(valorEmReal);

        System.out.println("Valor em Real: " + valorEmReal);
        System.out.println("Valor em Euro: " + valorEmEuro);
    }
}

import java.util.*;
public class ControllerSingleton {
    private static ControllerSingleton instance;

    private ControllerSingleton() {
    }

    public static ControllerSingleton getInstance() {
        if (instance == null) {
            instance = new ControllerSingleton();
        }
        return instance;
    }

    public void assinar() {
        // Implementação do método "assinar" do Controller
        System.out.println("Assinatura realizada no serviço meteorológico");
        Model.getInstance().desabilitarBotaoAssinar();
        Model.getInstance().habilitarBotaoCancelar();
    }

    public void cancelar() {
        // Implementação do método "cancelar" do Controller
        System.out.println("Assinatura cancelada");
        Model.getInstance().desabilitarBotaoCancelar();
        Model.getInstance().habilitarBotaoAssinar();
    }
}
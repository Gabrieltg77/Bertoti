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
        // Implementa��o do m�todo "assinar" do Controller
        System.out.println("Assinatura realizada no servi�o meteorol�gico");
        Model.getInstance().desabilitarBotaoAssinar();
        Model.getInstance().habilitarBotaoCancelar();
    }

    public void cancelar() {
        // Implementa��o do m�todo "cancelar" do Controller
        System.out.println("Assinatura cancelada");
        Model.getInstance().desabilitarBotaoCancelar();
        Model.getInstance().habilitarBotaoAssinar();
    }
}
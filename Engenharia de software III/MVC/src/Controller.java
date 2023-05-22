import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ControllerInterface {
    private View view;
    private Model model;

    public Controller(Model model) {
        this.model = model;
        view = new View(model, this);
        view.createView();
        view.desabilitarBotaoCancelar();
    }

    public void assinar() {
        model.registerObserver(view);
        System.out.println("Assinatura realizada no serviço meteorológico");
        view.desabilitarBotaoAssinar();
        view.habilitarBotaoCancelar();
    }

    public void cancelar() {
        model.removeObserver(view);
        System.out.println("Assinatura cancelada");
        view.desabilitarBotaoCancelar();
        view.habilitarBotaoAssinar();
    }
}

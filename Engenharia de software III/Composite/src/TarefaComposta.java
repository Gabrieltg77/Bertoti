import java.util.ArrayList;
import java.util.List;

public class TarefaComposta implements Tarefa {
    private String nome;
    private String descricao;
    private List<Tarefa> tarefas;

    public TarefaComposta(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.tarefas = new ArrayList<>();
    }

    @Override
    public void executar() {
        System.out.println("Executando a tarefa: " + nome);
        for (Tarefa tarefa : tarefas) {
            tarefa.executar();
        }
    }

    @Override
    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public void removerTarefa(Tarefa tarefa) {
        tarefas.remove(tarefa);
    }
}
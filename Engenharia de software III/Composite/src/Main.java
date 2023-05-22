public class Main {
    public static void main(String[] args)
    {
        TarefaComposta tarefaComposta1 = new TarefaComposta("Tarefa 1", "Tarefa composta 1");
        Tarefa tarefaSimples1 = new TarefaSimples("Subtarefa 1", "Tarefa simples 1");
        Tarefa tarefaSimples2 = new TarefaSimples("Subtarefa 2", "Tarefa simples 2");

        tarefaComposta1.adicionarTarefa(tarefaSimples1);
        tarefaComposta1.adicionarTarefa(tarefaSimples2);

        tarefaComposta1.executar();
    }
}
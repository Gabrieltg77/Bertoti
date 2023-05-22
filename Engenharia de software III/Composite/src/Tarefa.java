public interface Tarefa {
    void executar();
    void adicionarTarefa(Tarefa tarefa);
    void removerTarefa(Tarefa tarefa);
}
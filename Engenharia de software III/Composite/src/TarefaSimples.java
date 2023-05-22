public class TarefaSimples implements Tarefa {
    private String nome;
    private String descricao;

    public TarefaSimples(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @Override
    public void executar() {
        System.out.println("Executando a tarefa: " + nome);
    }

    @Override
    public void adicionarTarefa(Tarefa tarefa) {
        // N�o faz nada, pois � uma tarefa simples
    }

    @Override
    public void removerTarefa(Tarefa tarefa) {
        // N�o faz nada, pois � uma tarefa simples
    }
}
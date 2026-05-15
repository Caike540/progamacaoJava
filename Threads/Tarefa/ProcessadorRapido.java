package Threads.Tarefa;

public class ProcessadorRapido implements Runnable {
    private Tarefa tarefa;

    // Constutor que recebe a tarefa a ser processada

    public ProcessadorRapido(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    // Trata exceções que podem ocorrer durante a execução da tarefa
    @Override
    public void run() {
        try {
            System.out.println("[PROCESSADOR RÁPIDO] Iniciando processamento da tarefa " + tarefa.getId());
            tarefa.executar();
            System.out.println("[PROCESSADOR RÁPIDO] Processamento da tarefa " + tarefa.getId() + " finalizado");
        } catch (TarefaInvalidaException e) {
            System.err.println("[PROCESSADOR RÁPIDO] Erro: " + e.getMessage());
        }
    }
}

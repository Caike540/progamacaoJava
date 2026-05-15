package Threads.Tarefa;

public class ProcessadorLento implements Runnable {
    private Tarefa tarefa;

    // Constutor que recebe a tarefa a ser processada

    public ProcessadorLento(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
    
    // Trata exceções que podem ocorrer durante a execução da tarefa
    @Override
    public void run() {
        try {
            System.out.println("[PROCESSADOR LENTO] Iniciando processamento da tarefa " + tarefa.getId());
            tarefa.executar();
            System.out.println("[PROCESSADOR LENTO] Processamento da tarefa " + tarefa.getId() + " finalizado");
        } catch (TarefaInvalidaException e) {
            System.err.println("[PROCESSADOR LENTO] Erro: " + e.getMessage());
        }
    }
}

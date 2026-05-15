package Threads.Tarefa;

public class ProcessadorRapido implements Runnable {
    private Tarefa tarefa;

    // Constutor que recebe a tarefa a ser processada

    public ProcessadorRapido(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("[PROCESSADOR RÁPIDO] Iniciando processamento da tarefa " + tarefa.getId());
        tarefa.executar();
        System.out.println("[PROCESSADOR RÁPIDO] Tarefa " + tarefa.getId() + " finalizada.");
        } catch (TarefaInvalidaException e) {
            System.out.println("[PROCESSADOR RÁPIDO] Erro: " + e.getMessage());
        }
    }
}

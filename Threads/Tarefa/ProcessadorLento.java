package Threads.Tarefa;

public class ProcessadorLento implements Runnable {
    private Tarefa tarefa;

    // Constutor que recebe a tarefa a ser processada

    public ProcessadorLento(Tarefa tarefa) {
        this.tarefa = tarefa;
    }
    
    @Override
    public void run() {
        try {
            System.out.println("[PROCESSADOR LENTO] Iniciando processamento da tarefa " + tarefa.getId());
        tarefa.executar();
        System.out.println("[PROCESSADOR LENTO] Tarefa " + tarefa.getId() + " finalizada.");
        } catch (TarefaInvalidaException e) {
            System.out.println("[PROCESSADOR LENTO] Erro: " + e.getMessage());
        }
    }
}

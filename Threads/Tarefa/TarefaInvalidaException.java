package Threads.Tarefa;

// Exceção personalizada para reprensetar tarefas inválidas no sistema
// Esta exceção é lançada quando uma tarefa tem uma descrição nula ou vazia

public class TarefaInvalidaException extends Exception {

    // Construtor recebe uma mensagem de erro personalizada
    public TarefaInvalidaException(String message) {
        super(message);
    }
}
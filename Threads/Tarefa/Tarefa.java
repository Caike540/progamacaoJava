package Threads.Tarefa;

public class Tarefa {
    private int id;
    private String descricao;

    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public void executar() throws TarefaInvalidaException {
        // Válida se a descrição é válida
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new TarefaInvalidaException("Tarefa com ID " + id + ", descrição " + "[[ " + descricao + " ]] " + " inválida!");
        }

        // Imprime a descrição da tarefa
        System.out.println("[" + Thread.currentThread().getName() + "] Executando tarefa " + id + ": " + descricao);
   
        try {
            // Simula processamento da tarefa (1 segundo)
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("[" + Thread.currentThread().getName() + "] Tarefa " + id + " foi interrompida.");
            Thread.currentThread().interrupt(); // Restaura os status de interrupção
        }

        System.out.println("[" + Thread.currentThread().getName() + "] Tarefa " + id + " concluída!");
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
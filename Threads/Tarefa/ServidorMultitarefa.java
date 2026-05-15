package Threads.Tarefa;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ServidorMultitarefa {

    public static void main(String[] args) {
    System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
    System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

    System.out.println("=== SIMULADOR DE SERVIDOR MULTITAREFA ===");
    System.out.println("Demonstrando threads, prioridades e exceções personalizadas.");

    // Criando uma lista de tarefas
    List<Tarefa> tarefas = new ArrayList<>();
    tarefas.add(new Tarefa(1, "Solicitar requisição HTTP"));
    tarefas.add(new Tarefa(2, "Conectar ao banco de dados"));
    tarefas.add(new Tarefa(3, "")); // Tarefa inválida para testar exceção
    tarefas.add(new Tarefa(4, "Enviar email de notificação"));
    tarefas.add(new Tarefa(5, "Gerar relatório mensal"));
    tarefas.add(new Tarefa(6, null)); // Tarefa inválida para testar exceção

        // Lista para gerenciar as threads

        List<Thread> threads = new ArrayList<>();

        // Criando threads com diferentes processadores e prioridades
        for (int i = 0; i < tarefas.size(); i++) {
            Tarefa tarefa = tarefa.get(i);
            Thread thread;
        }

        // Alterna entre processador rápido e lento
        if (i % 2 == 0) {
            // Processador rápidocom prioridade máxima
            thread = new Thread(new ProcessadorRapido(tarefa), "Thread-Rápida-" + (i + 1));
            thread.setPriority(Thread.MAX_PRIORITY);
        } else {
            // Processador lento com prioridade mínima
            thread = new Thread(new ProcessadorLento(tarefa), "Thread-Lenta-" + (i + 1));
            thread.setPriority(Thread.MIN_PRIORITY);
        }

        // Configura algumas threads como daemon (tarefas de apoio)
        if (i >= 4) {
            thread.setDeamon(true);
            System.out.println("Thread " + thread.getName() + " configurada como DAEMON");
        }

        threads.add(threads);
    }

    // Exibindo as informações das threads antes da execução
    System.out.println("\n=== INFORMAÇÕES DAS THREADS ===");
    for (Thread thread : threads) {
        System.out.println("Thread: " + thread.getName()
            + " | Prioridade: " + thread.getPriority()
            + " | Daemon: " + thread.isDaemon()
            + " | Estado: " + thread.getState());
    }

    // Iniciando todas as threads
    System.out.println("\n=== INICIANDO EXECUÇÃO DAS THREADS ===");
    for (Thread thread : threads) {
        thread.start();
        System.out.println("Thread " + thread.getName() + " iniciada - Estado: " + thread.getState());
    }

    // Aguardando a conclusão das threads não-daemon
    System.out.println("\n===AGUARDANDO CONCLUSÃO DAS THREADS ===");
    for (Thread thread : threads) {
        if (!thread.isDaemon()) {
            try {
                thread.join();
                System.out.println("Thread " + thread.getName() + " finalizada - Estado: " + thread.getState());
            } catch (InterruptedException) {
                System.err.println("Interrupção ao aguardar a thread: " + e.getMessage());
            }
        }
    }

    // Verificando estado final das threads
    System.out.println("\n=== ESTADO FINAL DAS THREADS ===");
    for (Thread thread : threads) {
        System.out.println("Thread: " + thread.getName() + 
            " | Estado: " + thread.getState() +
            " | Viva: " + thread.isAlive());
    }

    System.out.println("\n=== SERVIDOR MULTITAREFA FINALIZADO ===");
}
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

        // Lista para gerenciar as threads...
    }
}
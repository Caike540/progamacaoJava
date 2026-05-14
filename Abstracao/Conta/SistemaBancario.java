package Abstracao.Conta;

import java.util.ArrayList;
import java.util.List;

public class SistemaBancario {
    
    public static void main(String[] args) {
        System.out.println("=== SISTEMA BANCÁRIO ===");
        System.out.println("Demostração de Herança e Polimorfismo em Java\n");

        // Criando uma lista de contas usando ArrayList
        List<Conta> contas = new ArrayList<>();

        // Adicionando contas de diferentes tipos
        contas.add(new ContaCorrente("John", 1003, 1500.00));
        contas.add(new ContaCorrente("Lipa", 1006, 2500.30));
        contas.add(new ContaPoupanca("Dave", 2002, 5000.00));
        contas.add(new ContaPoupanca("Teco", 2004, 3200.25));

        System.out.println("Contas criadas com sucesso!\n");

        // Demostrando polimorfismo dinâmico
        for (Conta conta : contas) {
            System.out.println("--- OPERAÇÕES PARA CONTA ---");

            conta.exibirInformacoes();

            System.out.println("\n>> Realizando depósito...");
            conta.depositar(500.00);

            System.out.println("\n>> Tentando realizar saque...");
            conta.sacar(200.00);

            System.out.println("Estado final da conta:");
            conta.exibirInformacoes();

            System.out.println("\n" + "=".repeat(50) + "\n");
        }

        // Demostrando mais funcionalidades
        System.out.println("=== TESTES ADICIONAIS ===");

        // Testando validações
        Conta contaTeste = new ContaCorrente("Teste Validação", 9999, 100.00);

        System.out.println("Testando depósito com valor negativo:");
        contaTeste.depositar(-50.00);

        System.out.println("\nTestando saque com valor negativo:");
        contaTeste.sacar(-30.00);

        System.out.println("\nTestando saque maior que saldo:");
        contaTeste.sacar(500.00);

        System.out.println("\nEstado da conte de teste:");
        contaTeste.exibirInformacoes();

        System.out.println("=== FIM DO SISTEMA BANCÁRIO ===");
    }
}

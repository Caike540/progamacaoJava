package Abstracao.Conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, int numero, double saldo) {
        super(titular, numero, saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser positivo!");
            return;
        }

        // Verifica se o valor é múltiplo de 10

        if (valor % 10 != 0) {
            System.out.println("Erro: Na Conta Poupança, o valor de saque deve ser múltiplo de 10!");
            return;
        }

        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na Conta Poupança!");
        } else {
            System.out.println("Erro: Saldo insuficiente para saque! Saldo atual: " + 
                            String.format("%.2f", getSaldo()));
        }
    }
}
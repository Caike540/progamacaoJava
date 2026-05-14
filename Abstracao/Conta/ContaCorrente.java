package Abstracao.Conta;

public class ContaCorrente extends Conta {
    
    public ContaCorrente(String titular, int numero, double saldo) {
        super(titular, numero, saldo);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: Valor de saque deve ser positivo!");
            return;
        }

        // Verifica se o valor é maior do que o saldo

        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na Conta Corrente!");
        } else {
            System.out.println("Erro: Saldo insuficiente para saque! Saldo atual: " + 
                            String.format("%.2f", getSaldo()));
        }
    }
}

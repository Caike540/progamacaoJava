package Abstracao.Conta;

public abstract class Conta {
    private String titular;
    private int numero;
    private double saldo;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = saldo + valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso!");
        }
        else {
            System.out.println("Erro: Valor de depósito deve ser positivo!");
        }
    }

    public abstract void sacar(double valor);

    public void exibirInformacoes() {
        System.out.println("=== Informações da Conta ===");
        System.out.println("Titlar: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + String.format("%.2f", saldo));
        System.out.println("Tipo: " + this.getClass().getSimpleName());
        System.out.println("============================");
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

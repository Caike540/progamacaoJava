package Abstracao.Conta;

public class Conta {
    String titular;
    int numero;
    double saldo;

    public Conta(String titular, int numero, double saldo) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String exibirInformacoes() {
        System.out.println("\nTitular: " + titular + "\nNúmero: " + numero + "\nSaldo: " + saldo);
        return "Conta";
    }
}

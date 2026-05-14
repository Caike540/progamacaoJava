package Abstracao.Pessoa;

public class Pessoa {
    String tipo;
    String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String retornaTipo() {
    return "Pessoa";
    } 
}

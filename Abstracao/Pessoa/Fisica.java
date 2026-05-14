package Abstracao.Pessoa;

public class Fisica extends Pessoa{

    public Fisica(String nome) {
        super(nome);
    }

    public String retornaTipo() {
        return "Fisica";
    }
}
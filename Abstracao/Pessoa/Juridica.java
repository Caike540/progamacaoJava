package Abstracao.Pessoa;

public class Juridica extends Pessoa{

    public Juridica(String nome) {
        super(nome);
    }

    public String retornaTipo() {
        return "Juridica";
    }   
}

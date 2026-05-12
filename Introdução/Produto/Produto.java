package Introdução.Produto;

public class Produto {
    String nome;
    double preco;

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco);
    }

    public void aumentarPreco(double percentual) {
        preco = preco + (preco * percentual / 100);
    }
}

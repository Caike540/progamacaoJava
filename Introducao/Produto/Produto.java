package Introducao.Produto;

public class Produto {
    String nome;
    double preco;
    int qtdEmEstoque;

    public Produto(String nome,double preco, int qtdEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEmEstoque = qtdEmEstoque;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " - Preço: " + preco + " - Quantidade em estoque: " + qtdEmEstoque);
    }
}
package Introducao.Personagens;

// Criando a classe "Personagens"

public class Personagens {
    String nome;
    String classe;
    int nivel;
    int pontosDeVida;
    double poderBase;

    // Definindo atributos para a classe "Personagens"

    public Personagens(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Criando método para exibir os status dos personagens

    public void exibirStatus() {
        System.out.println("--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase + "\n");
    }
}

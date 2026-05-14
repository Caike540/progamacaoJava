package Personagens;

// Criando a classe "Lanceiro" que herda da classe "Personagens"
public class Lanceiro extends Personagens {
    public Lanceiro(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Lanceiro", nivel, pontosDeVida, poderBase);
    }

    // Implementando o método abstrato para usar a habilidade do Lanceiro
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " usa a habilidade 'Lança Impalante'!");
    }
}

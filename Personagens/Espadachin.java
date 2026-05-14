package Personagens;

// Criando a classe "Espadachin" que herda da classe "Personagens"
public class Espadachin extends Personagens {
    public Espadachin(String nome, int nivel, int pontosDeVida, double poderBase) {
        super(nome, "Espadachin", nivel, pontosDeVida, poderBase);
    }

    // Implementando o método abstrato para usar a habilidade do Espadachin
    @Override
    public void usarHabilidade() {
        System.out.println(getNome() + " usa a habilidade 'Corte Veloz'!");
    } 
}

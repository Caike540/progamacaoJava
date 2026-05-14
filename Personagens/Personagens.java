package Personagens;

// Criando a classe "Personagens"

public abstract class Personagens {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;
    private double poderBase;

    // Inicializando atributos da classe "Personagens"

    public Personagens(String nome, String classe, int nivel, int pontosDeVida, double poderBase) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
        this.poderBase = poderBase;
    }

    // Criando método abstrato para usar habilidade do personagem
    public abstract void usarHabilidade();

    // Criando método para exibir os status dos personagens

    public void exibirStatus() {
        System.out.println("\n--- Status do Personagem ---");
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
        System.out.println("Poder Base: " + poderBase);
    }

    // Criando getters para acessar os atributos dos personagens
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public double getPoderBase() {
        return poderBase;
    }
}

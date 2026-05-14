package Personagens;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nDesafio Novato: Os Guardiões de Eldoria\n");

        Personagens heroi1 = new Personagens("Artur", "Lanceiro", 1, 100, 10.2);
        Personagens heroi2 = new Personagens("Kiara", "Espadachin", 10, 200, 15.6);
    
        heroi1.exibirStatus();
        heroi2.exibirStatus();
    }
    
}

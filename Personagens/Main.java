package Personagens;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== Desafio Novato: Os Guardiões de Eldoria ===\n");
        System.out.println("Usando as Habilidades dos Personagens:");

        // Usando ArrayList para criar polimorismo e hierarquia de coleção
        ArrayList<Personagens> personagens = new ArrayList<>();

        // Adicionando personagens de diferentes classes
        personagens.add(new Lanceiro("Artur", 1, 100, 10.2));
        personagens.add(new Espadachin("Kiara", 10, 200, 15.6));
        personagens.add(new Lanceiro("Luga", 5, 150, 12.8));
        personagens.add(new Espadachin("Benitto", 8, 180, 14.3));
    
        // Demostrando os status e habilidades de cada personagem usando polimorfismo dinâmico
        for (Personagens personagem : personagens) {
            personagem.exibirStatus();
            personagem.usarHabilidade();
        }  
    }   
}
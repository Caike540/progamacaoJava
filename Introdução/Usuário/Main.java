package Introdução.Usuário;

public class Main {
    public static void main(String[] args) {
        usuario u1 = new usuario();
        u1.nome = "Fulano";
        u1.email = "fulano@gmail.com";
        u1.senha = "123456";

        u1.fazerLogin();
    }
    
}

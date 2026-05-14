package Abstracao.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa[] grupo = new Pessoa[3];
        grupo[0] = new Fisica("Rodrigo");
        grupo[1] = new Juridica("Augusto LTDA");
        grupo[2] = new Pessoa("João Pedro");

        for (int i = 0; i < grupo.length; i++) {
            System.out.println(grupo[i].retornaTipo());
        }
    }
}

import personagens.Jogador;
import personagens.Inimigo;
import combate.Combate;

public class Main {
    public static void main(String[] args) {
        System.out.println("🌍 Bem-vindo ao RPG Terminal!");
        Jogador jogador = new Jogador("Herói");

        Inimigo slime = new Inimigo("Slime Verde", 50, 10, 2, 1);
        Combate.iniciar(jogador, slime);

        Inimigo goblin = new Inimigo("Goblin Selvagem", 80, 12, 4, 2);
        Combate.iniciar(jogador, goblin);

        System.out.println("🏆 Fim da jornada!");
    }
}

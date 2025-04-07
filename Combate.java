package combate;

import personagens.Jogador;
import personagens.Inimigo;
import util.Randomizador;

public class Combate {

    public static void iniciar(Jogador jogador, Inimigo inimigo) {
        System.out.println("Início do combate: " + jogador.getNome() + " vs. " + inimigo.getNome());

        while (jogador.estaVivo() && inimigo.estaVivo()) {
            if (Randomizador.sorteioTurno()) {
                jogador.atacar(inimigo);
            } else {
                inimigo.atacar(jogador);
            }

            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }

        if (jogador.estaVivo()) {
            System.out.println(jogador.getNome() + " venceu o combate!");
            jogador.subirNivel();
        } else {
            System.out.println(jogador.getNome() + " foi derrotado.");
        }
    }
}

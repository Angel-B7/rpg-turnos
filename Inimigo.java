package personagens;

public class Inimigo extends Personagem {

    public Inimigo(String nome, int vida, int ataque, int defesa, int nivel) {
        super(nome, vida, ataque, defesa, nivel);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(nome + " ataca " + alvo.getNome() + "!");
        alvo.receberDano(ataque);
    }
}

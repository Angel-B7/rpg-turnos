package personagens;

public class Jogador extends Personagem {

    public Jogador(String nome) {
        super(nome, 100, 15, 5, 1);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(nome + " ataca " + alvo.getNome() + "!");
        alvo.receberDano(ataque);
    }

    public void subirNivel() {
        nivel++;
        ataque += 5;
        defesa += 2;
        vida += 20;
        System.out.println(nome + " subiu para o nível " + nivel + "! Atributos melhorados.");
    }
}

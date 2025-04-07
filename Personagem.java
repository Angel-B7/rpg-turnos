package personagens;

public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int ataque;
    protected int defesa;
    protected int nivel;

    public Personagem(String nome, int vida, int ataque, int defesa, int nivel) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.nivel = nivel;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        int danoReal = Math.max(0, dano - defesa);
        vida -= danoReal;
        System.out.println(nome + " recebeu " + danoReal + " de dano. Vida restante: " + vida);
    }

    public abstract void atacar(Personagem alvo);

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}

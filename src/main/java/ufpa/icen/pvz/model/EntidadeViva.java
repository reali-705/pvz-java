package ufpa.icen.pvz.model;

public abstract class EntidadeViva extends Entidade {
    protected int vida;
    protected int vidaMaxima;

    public EntidadeViva(int vidaMaxima, double posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            this.vida = 0;
            this.estado = EstadoEntidade.MORTA;
        }
    }

    // Getters e Setters
    public int getVida() {
        return vida;
    }
    public int getVidaMaxima() {
        return vidaMaxima;
    }
    public void setVida(int vida) {
        this.vida = vida;
        if (this.vida > this.vidaMaxima) {
            this.vida = this.vidaMaxima;
        }
        if (this.vida <= 0) {
            this.vida = 0;
            this.estado = EstadoEntidade.MORTA;
        }
    }
}

package ufpa.icen.pvz.model;

public abstract class Entidade {
    protected int vida;
    protected int vidaMaxima;
    protected double posicaoX;
    protected int posicaoY;
    protected EstadoEntidade estado;

    public Entidade(int vidaMaxima, double posicaoX, int posicaoY) {
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.estado = EstadoEntidade.VIVO;
    }

    public void receberDano(int dano) {
        this.vida -= dano;
        if (this.vida <= 0) {
            this.vida = 0;
            this.estado = EstadoEntidade.MORTO;
        }
    }

    public abstract void atualizar();

    // Getters e Setters
    public EstadoEntidade getEstado() {
        return estado;
    }
    public void setEstado(EstadoEntidade estado) {
        this.estado = estado;
    }

    public double getPosicaoX() {
        return posicaoX;
    }
    public int getPosicaoY() {
        return posicaoY;
    }

    public int getVida() {
        return vida;
    }
    public int getVidaMaxima() {
        return vidaMaxima;
    }
}

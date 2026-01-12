package ufpa.icen.pvz.model;

public abstract class Entidade {
    protected double posicaoX;
    protected int posicaoY;
    protected EstadoEntidade estado;

    public Entidade(double posicaoX, int posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.estado = EstadoEntidade.VIVA;
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
}

package ufpa.icen.pvz.model;

/*
 * Representa um objeto que pode se mover no jogo.
*/

public interface Movivel {
    // Método para mover o objeto
    void mover();
    // Método para obter a velocidade do objeto
    double getVelocidade();
}

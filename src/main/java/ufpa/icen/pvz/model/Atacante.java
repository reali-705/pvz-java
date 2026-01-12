package ufpa.icen.pvz.model;

/*
 * Representa um objeto que pode atacar no jogo.
*/
public interface Atacante {
    // Método para realizar um ataque
    void atacar();
    // Método para obter o dano causado pelo ataque
    int getDano();
    // Método para verificar se o atacante pode atacar no momento
    boolean podeAtacar();
}

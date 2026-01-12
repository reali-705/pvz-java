package ufpa.icen.pvz.model;

/*
Classe de configuração do jogo Plants vs Zombies.
Contém constantes que definem parâmetros constantes do jogo.
*/

public class Config {
    // tabuleiro
    public static final int LARGURA_TABULEIRO = 9;
    public static final int ALTURA_TABULEIRO = 5;
    
    // recursos
    public static final int RECURSOS_INICIAIS = 50;
    public static final int RECURSOS_POR_CICLO = 25;
    public static final int CUSTO_ATIRADOR = 50;

    // tempo em milissegundos
    public static final int TEMPO_CICLO = 500;
    public static final int TEMPO_DISPARO = 1000;
    public static final int TEMPO_SPAWN_ZUMBIS = 3000;

    // entidades
    public static final int VIDA_ZUMBI = 100;
    public static final int DANO_ZUMBI = 10;
    public static final double VELOCIDADE_ZUMBI = 0.5;
    public static final int VIDA_ATIRADOR = 50;
    public static final int DANO_ATIRADOR = 20;
    public static final double VELOCIDADE_PROJETIL = 1.5;

    // Construtor privado para evitar instanciação
    private Config() {
        throw new UnsupportedOperationException("Classe de configuração não pode ser instanciada.");
    }
}

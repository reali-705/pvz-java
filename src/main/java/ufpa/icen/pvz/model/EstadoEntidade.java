package ufpa.icen.pvz.model;

/*
Representa os possíveis estados de uma entidade no jogo.
*/

public enum EstadoEntidade {
    // Entidade ativa e esperando ação
    VIVO,
    // Entidade realizando um ataque
    ATACANDO,
    // Entidade em movimento
    MOVENDO,
    // Entidade que foi eliminada (será removida do jogo)
    MORTO
}

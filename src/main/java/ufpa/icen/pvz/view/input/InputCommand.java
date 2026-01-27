package ufpa.icen.pvz.view.input;

import ufpa.icen.pvz.model.Planta;
import ufpa.icen.pvz.model.Grid; // ajuste conforme a criação do grid

public class InputCommand {

    private final PlayerInput action;
    private final Planta planta;
    private final Grid posicao;

    // Construtor
    public InputCommand(PlayerInput action, Planta planta, Grid posicao){
        this.action = action;
        this.planta = planta;
        this.posicao = posicao;
    }

    // Getters
    public PlayerInput getAction() {
        return action;
    }

    public Planta getPlanta() {
        return planta;
    }

    public Grid getPosicao() {
        return posicao;
    }
}

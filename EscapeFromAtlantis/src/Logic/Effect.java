/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import UI.*;
import Data.*;

/**
 *
 * @author macas
 */
public class Effect {

    private GameMaster master;

    public Effect(GameMaster master) {
        this.master = master;
    }

    public void accionarEfecto(Tile tile) {
        switch (tile.getEffect()) {// String1.equals(String2)
            case "volcan":
                master.endGame();
                break;
            case "mover serpiente":
                master.moveSeaSerpent();
                break;
            case "mover tiburon":
                master.moveShark();
                break;
            case "mover ballena":
                master.moveWhale();
                break;
        }

    }

}

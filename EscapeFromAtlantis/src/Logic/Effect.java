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

    private GraphicsUI graficadora;
    private GameMaster master;

    public Effect(GraphicsUI graficadora, GameMaster master) {
        this.graficadora = graficadora;
        this.master = master;
    }

    public void accionarEfecto(Tile tile) {
        switch (tile.getEffect()) {// String1.equals(String2)
            case "volcan":
                graficadora.endScreen();
                break;
            case "agua":

                break;
            case "poner ballena":
                graficadora.drawWhale();
                break;
            case "poner tiburon":
                graficadora.drawShark();
                break;
            case "poner barco":
                graficadora.drawBoat();
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
            case "eliminar ballena":
                master.eliminateWhale();
                break;
            case "eliminar tiburon":
                master.eliminateShark();
                break;

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.Player;

/**
 *
 * @author Juan
 */
public class Comprobations {

    private GameMaster gameMaster;

    public Comprobations(GameMaster gameMaster) {

        this.gameMaster = gameMaster;

    }

    /**
     * Retorna true si el jugador tiene movimientos disponibles
     *
     * @return
     */
    public static boolean canMove(Player player) {
        if (player.getNumberOfMovements() > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que define si es permitido mover el villager o bote al destino
     *
     * @return
     */

    public static boolean isPermitted() {

    }

}

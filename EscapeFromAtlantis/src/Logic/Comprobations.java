/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.*;

import javax.swing.JLabel;

/**
 *
 * @author Juan
 */
public class Comprobations {

    private GameMaster gameMaster;

    public Comprobations(GameMaster gameMaster) {

        this.gameMaster = gameMaster;

    }

    //validacion posicion de proxima Tile para Animal
    public boolean ValidateNextMovementA(Animal a, Tile t, JLabel animal, JLabel tile) {
//        //validacion tile Izquierda
//        if ((a.getNextX() == t.getX() - 2) && (a.getNextY() == t.getY())) {
//            return true;
//        }
//        //validacion tile Derecha
//        if ((a.getNextX() == t.getX() + 2) && (a.getNextY() == t.getY())) {
//            return true;
//        }
//        //validacion tile Superior Izquierda
//        if ((a.getNextX() == t.getX() - 1) && (a.getNextY() == t.getY() - 1)) {
//            return true;
//        }
//        //validacion tile Superior Derecha
//        if ((a.getNextX() == t.getX() + 1) && (a.getNextY() == t.getY() - 1)) {
//            return true;
//        }
//        //validacion tile Inferior Izquierda
//        if ((a.getNextX() == t.getX() - 1) && (a.getNextY() == t.getY() + 1)) {
//            return true;
//        }
//        //validacion tile Inferior Derecha
//        if ((a.getNextX() == t.getX() + 1) && (a.getNextY() == t.getY() + 1)) {
//            return true;
//        }
        return false;
    }

 

   

    //validacion posicion de proxima Tile para Villager
    public int validateNextMovementV(Villager v, Tile t, JLabel villager, JLabel tile) {
        int xVillager = 0;
        int yVillager = 0;

        int xDestino = 0;
        int yDestino = 0;

        int totalMovement = 0;

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 25; j++) {

                if (gameMaster.getCasillas()[i][j].getLabel() != null) {
                    if (gameMaster.getCasillas()[i][j].getLabel().equals(v.getJlabel())) {
                        xVillager = i;
                        yVillager = j;
                    } else if (t.getX() == i && t.getY() == j) {
                        xDestino = i;
                        yDestino = j;
                    }
                }

            }

        }

        totalMovement += Math.abs(xVillager - xDestino);
        totalMovement += Math.abs(yVillager - yDestino);

        return totalMovement;

        /**
         *
         *
         *
         * //validacion tile Izquierda if ((v.getNextX() == t.getX() - 2) &&
         * (v.getNextY() == t.getY())) { return true; } //validacion tile
         * Derecha if ((v.getNextX() == t.getX() + 2) && (v.getNextY() ==
         * t.getY())) { return true; } //validacion tile Superior Izquierda if
         * ((v.getNextX() == t.getX() - 1) && (v.getNextY() == t.getY() - 1)) {
         * return true; } //validacion tile Superior Derecha if ((v.getNextX()
         * == t.getX() + 1) && (v.getNextY() == t.getY() - 1)) { return true; }
         * //validacion tile Inferior Izquierda if ((v.getNextX() == t.getX() -
         * 1) && (v.getNextY() == t.getY() + 1)) { return true; } //validacion
         * tile Inferior Derecha if ((v.getNextX() == t.getX() + 1) &&
         * (v.getNextY() == t.getY() + 1)) { return true; } return false;
         *
         */
    }

    /**
     * Retorna true si el jugador tiene movimientos disponibles
     *
     * @return
     */
    public boolean canMove(Player player) {
        if (player.getNumberOfMovements() > 0) {
            return true;
        } else {
            return false;
        }
    }

}

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
    public int validateNextMovementV(Villager v, Tile t) {
        int totalMovement = 0;

        totalMovement += Math.abs(v.getX() - t.getX());
        totalMovement += Math.abs(v.getY() - t.getY());

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
    public boolean canMove() {
        System.out.println(gameMaster.returnPlayerInTurn().getNumberOfMovements());
        if (gameMaster.returnPlayerInTurn().getNumberOfMovements() > 0) {
            return true;
        } else {
            gameMaster.returnPlayerInTurn().getNumberOfMovements();
            return false;
        }
    }

}

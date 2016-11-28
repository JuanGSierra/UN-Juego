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
//    public boolean ValidateNextMovementA(Animal a, Tile t, JLabel animal, JLabel tile) {
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
//        return false;
//    }

    //validacion posicion de proxima Tile para Villager
    public boolean validateNextMovementV(Villager v, Tile t, JLabel villager, JLabel tile) {
        //validacion tile Izquierda
        if ((v.getNextX() == v.getX() - 2) && (v.getNextY() == v.getY())) {
            return true;
        }
        //validacion tile Derecha
        if ((v.getNextX() == v.getX() + 2) && (v.getNextY() == v.getY())) {
            return true;
        }
        //validacion tile Superior Izquierda
        if ((v.getNextX() == v.getX() - 1) && (v.getNextY() == v.getY() - 1)) {
            return true;
        }
        //validacion tile Superior Derecha
        if ((v.getNextX() == v.getX() + 1) && (v.getNextY() == v.getY() - 1)) {
            return true;
        }
        //validacion tile Inferior Izquierda
        if ((v.getNextX() == v.getX() - 1) && (v.getNextY() == v.getY() + 1)) {
            return true;
        }
        //validacion tile Inferior Derecha
        if ((v.getNextX() == v.getX() + 1) && (v.getNextY() == v.getY() + 1)) {
            return true;
        }
        return false;
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

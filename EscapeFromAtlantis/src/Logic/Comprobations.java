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
    public boolean ValidateNextPositionA (Animal a, Tile t){
        
        
        return true;
    }
    //validacion posicion de proxima Tile para Villager
    public boolean ValidateNextMovementV (Villager v, Tile t){
        //validacion tile Izquierda
        if((v.getNextX()==t.getX()-2)&&(v.getNextY()==t.getY())){
            return true;
        }
        //validacion tile Derecha
        if((v.getNextX()==t.getX()+2)&&(v.getNextY()==t.getY())){
            return true;
        }
        //validacion tile Superior Izquierda
        if((v.getNextX()==t.getX()-1)&&(v.getNextY()==t.getY()-1)){
            return true;
        }
        //validacion tile Superior Derecha
        if((v.getNextX()==t.getX()+1)&&(v.getNextY()==t.getY()-1)){
            return true;
        }
        //validacion tile Inferior Izquierda
        if((v.getNextX()==t.getX()-1)&&(v.getNextY()==t.getY()+1)){
            return true;
        }
        //validacion tile Inferior Derecha
        if((v.getNextX()==t.getX()+1)&&(v.getNextY()==t.getY()+1)){
            return true;
        } 
       return false; 
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

    public static boolean isPermitted(JLabel destino, JLabel villager) {
        return true;
    }

}

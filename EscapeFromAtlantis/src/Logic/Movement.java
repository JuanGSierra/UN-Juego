/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.*;
import UI.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author macas
 */
public class Movement {

    private String direction;
    private int numberOfTiles;

    private GameMaster gameMaster;

    public Movement(GameMaster gameMaster) {
        this.gameMaster = gameMaster;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getNumberOfTiles() {
        return numberOfTiles;
    }

    public void setNumberOfTiles(int numberOfTiles) {
        this.numberOfTiles = numberOfTiles;
    }

    public void moveSeaSerpent() {

    }

    public void moveShark() {

    }

    public void moveWhale() {

    }

    public void moverVillager(JLabel destino, JLabel villager, Villager v, Tile t) {

        if (gameMaster.getComprobations().canMove(gameMaster.returnPlayerInTurn())) {

            if (gameMaster.getComprobations().validateNextMovementV(v, t, destino, villager)) {
                gameMaster.getVillagerCenters().changeVillagerLabelTo(v.getJlabel(), t.getX(), t.getY());

            }
        } else {
            JOptionPane.showMessageDialog(gameMaster.getGraphicsUI(), "No se pudo mover el aldeano, verifique las reglas del juego");
        }

    }
}

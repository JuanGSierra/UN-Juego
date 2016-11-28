/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author macas
 */
public class Movement {

    private String direction;
    private int numberOfTiles;
    private boolean primerTurno = true;

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
    
    public void segundoTurno(){
        this.primerTurno = false;
    }

    public void moverVillager(JLabel destino, JLabel villager, Villager v, Tile t) {

        if (gameMaster.getComprobations().canMove(gameMaster.returnPlayerInTurn())) {
            System.out.println("rty");
            switch (gameMaster.returnPlayerInTurn().getNumberOfMovements()) {

                case 1:
                    if (!(gameMaster.getComprobations().validateNextMovementV(v, t, destino, villager) > 2)) {
                        if (!primerTurno) {
                            gameMaster.getTileCasilla(v.getX(), v.getY()).eliminarVillager(v);
                        }
                        System.out.println("suc");
                        gameMaster.getTileOfJLabel(destino).agregarVillager(v);
                        gameMaster.getVillagerCenters().changeVillagerLabelTo(v, t.getX(), t.getY());
                    } else {
                        JOptionPane.showMessageDialog(gameMaster.getGraphicsUI(), "NO tiene movimientos suficientes");
                    }

                    break;
                case 2:
                    if (!(gameMaster.getComprobations().validateNextMovementV(v, t, destino, villager) > 4)) {
                        if (!primerTurno) {
                            gameMaster.getTileCasilla(v.getX(), v.getY()).eliminarVillager(v);
                        }
                        System.out.println("suc");
                        gameMaster.getTileOfJLabel(destino).agregarVillager(v);
                        gameMaster.getVillagerCenters().changeVillagerLabelTo(v, t.getX(), t.getY());

                    } else {
                        JOptionPane.showMessageDialog(gameMaster.getGraphicsUI(), "NO tiene movimientos suficientes");
                    }
                    break;
                case 3:
                    if (!(gameMaster.getComprobations().validateNextMovementV(v, t, destino, villager) > 6)) {
                        if (!primerTurno) {
                            gameMaster.getTileCasilla(v.getX(), v.getY()).eliminarVillager(v);
                        }
                        System.out.println("suc");
                        gameMaster.getTileOfJLabel(destino).agregarVillager(v);
                        gameMaster.getVillagerCenters().changeVillagerLabelTo(v, t.getX(), t.getY());

                    } else {
                        JOptionPane.showMessageDialog(gameMaster.getGraphicsUI(), "NO tiene movimientos suficientes");
                    }
                    break;
                default:
                    System.out.println("xDDDDDD");
                    break;
            }
            System.out.println("rty2");
        } else {
            JOptionPane.showMessageDialog(gameMaster.getGraphicsUI(), "No se pudo mover el aldeano, verifique las reglas del juego");
            System.out.println("mavgtrb lisdf");
        }

    }
}

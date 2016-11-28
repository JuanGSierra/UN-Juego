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
    private boolean primerTurno;

    private GameMaster gameMaster;

    public Movement(GameMaster gameMaster) {
        this.gameMaster = gameMaster;
        primerTurno = true;
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

    public void segundoTurno() {
        this.primerTurno = false;
    }

    public void moverVillager(Villager villager, Tile tile) {
        System.out.println(gameMaster.returnPlayerInTurn().getNumberOfMovements());
        if (primerTurno) {
            gameMaster.returnPlayerInTurn().reinitializeMovements();
        }
        if (gameMaster.getComprobations().canMove()) {

            switch (gameMaster.returnPlayerInTurn().getNumberOfMovements()) {

                case 1:
                    if (gameMaster.getComprobations().validateNextMovementV(villager, tile) <= 2 || primerTurno) {
                        if (!primerTurno) {
                            tile.eliminarVillager(villager);
                        }

                        gameMaster.getVillagerCenters().changeVillagerLabelTo(villager, tile);
                        tile.agregarVillager(villager);
                        villager.setX(tile.getX());
                        villager.setY(tile.getY());

                        if (!primerTurno) {
                            System.out.println(gameMaster.returnPlayerInTurn().getName());
                            gameMaster.returnPlayerInTurn().setNumberOfMovements(1);
                        }
                    } else {
                        JOptionPane.showMessageDialog(gameMaster.getGraphicsUI(), "NO tiene movimientos suficientes 1");
                    }

                    break;
                case 2:
                    if (gameMaster.getComprobations().validateNextMovementV(villager, tile) <= 4 || primerTurno) {
                        if (!primerTurno) {
                            tile.eliminarVillager(villager);
                        }

                        gameMaster.getVillagerCenters().changeVillagerLabelTo(villager, tile);
                        tile.agregarVillager(villager);
                        villager.setX(tile.getX());
                        villager.setY(tile.getY());
                        if (!primerTurno) {
                            System.out.println(gameMaster.returnPlayerInTurn().getName());
                            gameMaster.returnPlayerInTurn().setNumberOfMovements(2);
                        }
                    } else {
                        JOptionPane.showMessageDialog(gameMaster.getGraphicsUI(), "NO tiene movimientos suficientes 2");
                    }
                    break;
                case 3:
                    if (gameMaster.getComprobations().validateNextMovementV(villager, tile) <= 6 || primerTurno) {
                        if (!primerTurno) {
                            tile.eliminarVillager(villager);
                        }

                        gameMaster.getVillagerCenters().changeVillagerLabelTo(villager, tile);
                        tile.agregarVillager(villager);
                        villager.setX(tile.getX());
                        villager.setY(tile.getY());
                        if (!primerTurno) {
                            System.out.println(gameMaster.returnPlayerInTurn().getName());
                            gameMaster.returnPlayerInTurn().setNumberOfMovements(3);
                        }
                    } else {
                        JOptionPane.showMessageDialog(gameMaster.getGraphicsUI(), "NO tiene movimientos suficientes 3");
                    }
                    break;

            }
        } else {
            JOptionPane.showMessageDialog(gameMaster.getGraphicsUI(), "No se pudo mover el aldeano, verifique las reglas del juego");

        }

    }
}

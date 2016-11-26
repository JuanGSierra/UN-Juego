/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Data.*;
import UI.*;

/**
 *
 * @author macas
 */
public class Movement {

    private String direction;
    private int numberOfTiles;
    private GraphicsUI consola;

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

    public static void moveVillage(Villager village, int posX, int posY) {
        int x = 0;
        int y = 0;
        if (x > 1 || y > 1 || ((x == 0 && y == 0))) {
            System.out.println("Ingrese una opción valida!!"
                    + " pierde turno");

        } else {

        }
    }

    public void moveVillagers(Villager villager, int x, int y) {

    }

    /**
     * Determina el final del juego
     *
     * @param villager - revisa que el cosito este es una casilla de salvación
     * @return retorna un entero, que sale del loop del juego
     */
    public void moveSeaSerpent() {

    }

    public void moveShark() {

    }

    public void moveWhale() {

    }
}

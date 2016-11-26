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
public class MapManager {

    private Movement movement;
    private GraphicsUI map;

    public Tile changeTile(Tile tile) {
        return new WaterTile(tile.getPosition(), true);
    }

    public MapManager(GraphicsUI map) {
        this.map = map;
        movement = new Movement();

    }

    public void addVillagers(Villager villager, int x, int y) {
        movement.moveVillage(villager, x, y);
    }

}

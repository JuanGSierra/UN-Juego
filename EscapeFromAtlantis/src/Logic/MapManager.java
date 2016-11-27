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

    private GraphicsUI graphicsUI;

    
    public Tile changeTile(Tile tile) {
        return new WaterTile(tile.getPosition(), tile.getX(), tile.getY(), true);
    }

    public MapManager(GraphicsUI map) {
        this.graphicsUI = map;

    }

}

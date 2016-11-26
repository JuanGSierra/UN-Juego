/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.Serializable;

/**
 *
 * @author macas
 */
public class WaterTile extends Tile implements Serializable{
    
    private String inside;

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }
    
    public WaterTile(int position, boolean inBoard) {
        super(position, true, "NULL");
        inside = "~";
    }

    public void printWaterTile(WaterTile x){
        System.out.print(x.inside);
    }

}
